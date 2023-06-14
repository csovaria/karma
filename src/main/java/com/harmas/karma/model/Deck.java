package com.harmas.karma.model;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    protected LinkedList<Card> cards;

    protected Deck() {
        this.cards = new LinkedList<>();
    }

    protected void saveCards(List<Card> cards){
        this.cards.addAll(cards);
    }
}
