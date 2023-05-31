package com.harmas.karma.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Game {

    private List<Player> players;
    private List<Card> drawDeck;
    private List<Card> burnDeck;
    private List<Card> playDeck;
    private static final int NUMBER_OF_DECKS = 1;

    private int numberOfPlayers = 2;
    public Game() {
        this.drawDeck = new ArrayList<>();
        generateDecks();
    }

    public void generateDecks(){
        for (int i = 0; i < NUMBER_OF_DECKS; i++) {
            for(CardType card: CardType.values()){
                for (ColorType type : ColorType.values()){
                    drawDeck.add(new Card(card, type));
                }
            }
        }
    }
}
