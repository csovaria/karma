package com.harmas.karma.repository.DAO;


import com.harmas.karma.model.Card;

import java.util.LinkedList;
import java.util.List;

public interface DeckDAO {

    void initializeDrawDeck(LinkedList<Card> generateDrawDeck);

    List<Card> drawCards(int numberOfCards);

    void placeCards(List<Card> cards);

//    void dealCards(List<Card> pickCards);
}
