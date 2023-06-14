package com.harmas.karma.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DrawDeck extends Deck implements EmptyCheckable{

    public Card handOverCard(){
        Card card = this.cards.getLast();
        this.cards.removeLast();
        return card;
    }

    public List<Card> handOverCards(int numberOfCards){
        List<Card> cards;
        cards = this.cards.subList(0, numberOfCards);
        this.cards.subList(0, numberOfCards).clear();
        return cards;
    }

    public void initializeDeck(){
        LinkedList<Card> cards = new LinkedList<>();
        for (CardValue card : CardValue.values()) {
            for (CardColor type : CardColor.values()) {
                cards.add(new Card(card, type));
            }
        }
        Collections.shuffle(cards);
        this.cards = cards;
    }

    @Override
    public boolean isEmpty() {
        return this.cards.isEmpty();
    }
}
