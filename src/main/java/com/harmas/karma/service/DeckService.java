package com.harmas.karma.service;

import com.harmas.karma.repository.DAO.DeckDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.harmas.karma.model.Card;
import com.harmas.karma.model.CardColor;
import com.harmas.karma.model.CardValue;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



@Service
public class DeckService {

    @Autowired
    private DeckDAO deckDAO;

    public void initializeDrawDeck(){
        deckDAO.initializeDrawDeck(generateDrawDeck());
    }

    public void playCardFromDrawDeck(){
        placeCards(deckDAO.drawCards(1));
    }

    public void placeCards(List<Card> cards){
        deckDAO.placeCards(cards);
    }

    public List<Card> drawCards(int numberOfCards){
        return deckDAO.drawCards(numberOfCards);
    }


    public LinkedList<Card> generateDrawDeck() {
        LinkedList<Card> cards = new LinkedList<>();
        for (CardValue card : CardValue.values()) {
            for (CardColor type : CardColor.values()) {
                cards.add(new Card(card, type));
            }
        }
        Collections.shuffle(cards);
        return cards;
    }
}
