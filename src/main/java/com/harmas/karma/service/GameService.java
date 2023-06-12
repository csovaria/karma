package com.harmas.karma.service;

import com.harmas.karma.model.Card;
import com.harmas.karma.model.CardColor;
import com.harmas.karma.model.CardValue;
import com.harmas.karma.repository.DAO.DeckDAO;
import com.harmas.karma.repository.DAO.PlayerDAO;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;

@Service
public class GameService {
    private DeckDAO deckMemory;
    private PlayerDAO playerMemory;

    public GameService(DeckDAO deckMemory, PlayerDAO playerMemory) {
        this.deckMemory = deckMemory;
        this.playerMemory = playerMemory;
    }

//    public boolean playCardFromHand(List<Card> cards) {
//        return game.playCardFromHand(cards);
//    }
//
//    public List<Card> getCurrentPlayerCards(){
//        return game.getCurrentPlayer().getCards()
//    }
    public void initializeGame() {
        deckMemory.initializeDrawDeck(generateDrawDeck());
        deckMemory.placeCards(deckMemory.drawCards(1));
        playerMemory.instantiatePlayers();
        playerMemory.pullCards(deckMemory.drawCards(3));
        playerMemory.moveToTheNextPlayer();
        playerMemory.pullCards(deckMemory.drawCards(3));
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
