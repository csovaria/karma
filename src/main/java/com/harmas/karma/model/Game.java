package com.harmas.karma.model;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
@Component
public class Game {

    private List<Player> players;
    private LinkedList<Card> drawDeck;
    private LinkedList<Card> burnDeck;
    private LinkedList<Card> playDeck;
    private static final int NUMBER_OF_DECKS = 1;

    private static final int NUMBER_OF_PLAYERS = 2;

    public Game() {
        burnDeck = new LinkedList<>();
        playDeck = new LinkedList<>();
        drawDeck = new LinkedList<>();
        generateDecks();
    }

    public void generateDecks(){
        for (int i = 0; i < NUMBER_OF_DECKS; i++) {
            for(CardValue card: CardValue.values()){
                for (CardColor type : CardColor.values()){
                    drawDeck.add(new Card(card, type));
                }
            }
        }
    }
}
