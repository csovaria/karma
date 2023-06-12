package com.harmas.karma.repository.memory;

import com.harmas.karma.model.Card;
import com.harmas.karma.model.Player;
import com.harmas.karma.repository.DAO.DeckDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DeckMemory implements DeckDAO {
    private LinkedList<Card> drawDeck;
    private LinkedList<Card> burnDeck;
    private LinkedList<Card> playDeck;


    private DeckMemory() {
        burnDeck = new LinkedList<>();
        playDeck = new LinkedList<>();
        drawDeck = new LinkedList<>();
    }

    public void initializeDrawDeck(LinkedList<Card> cards) {
        drawDeck.addAll(cards);
    }

    @Override
    public List<Card> drawCards(int numberOfCards) {
        List<Card> cards;
        cards = drawDeck.subList(0, numberOfCards);
        drawDeck.subList(0, numberOfCards).clear();
        return cards;
    }

    @Override
    public void placeCards(List<Card> cards) {
        playDeck.addAll(cards);
    }

//    @Override
//    public void dealCards(List<Card> pickCards) {
//
//    }


}
