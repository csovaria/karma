package com.harmas.karma.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class Game {
    private List<Player> players;
    private Player currentPlayer;
    private LinkedList<Card> drawDeck;
    private LinkedList<Card> burnDeck;
    private LinkedList<Card> playDeck;
    private static final int NUMBER_OF_DECKS = 1;
    private static final int NUMBER_OF_PLAYERS = 2;

    public Game() {
        burnDeck = new LinkedList<>();
        playDeck = new LinkedList<>();
        drawDeck = new LinkedList<>();
        players = new ArrayList<>();
        generateDecks();
        generatePlayers();
        dealCards();
    }


    private void generatePlayers() {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players.add(new Player("Player " + i));
        }
    }


    public void generateDecks() {
        for (int i = 0; i < NUMBER_OF_DECKS; i++) {
            for (CardValue card : CardValue.values()) {
                for (CardColor type : CardColor.values()) {
                    drawDeck.add(new Card(card, type));
                }
            }
        }
        Collections.shuffle(drawDeck);
    }


    private void dealCards() {
        playDeck.add(drawDeck.pop());
        for (Player player : players) {
            List<Card> cards = new ArrayList<>(drawDeck.subList(0, 2));
            drawDeck.subList(0, 2).clear();
            player.pullCards(cards);
        }
    }


    public boolean isCardCanBePlaced(Card card) {
        Card topCard = playDeck.getFirst();
        return card.getValue() >= topCard.getValue()
                || card.getValue().equals(CardValue.TWO.getValue())
                || card.getValue().equals(CardValue.TEN.getValue());
    }


    public boolean areCardsValuesEquals(List<Card> cards) {
        return cards.stream().allMatch(card -> card.getValue().equals(cards.get(0).getValue()));
    }


    public boolean areCardsCanBePlaced(List<Card> cards) {
        if (!areCardsValuesEquals(cards)) return false;
        return isCardCanBePlaced(cards.get(0));
    }


    public void placeCardsOnPlayDeck(List<Card> cards) {
        playDeck.addAll(cards);
    }


    public boolean playCardFromHand(List<Card> cards) {
        if (areCardsCanBePlaced(cards)) {
            placeCardsOnPlayDeck(cards);
            return true;
        }
        return false;
    }
    public void drawPlayDeck() {
        currentPlayer.pullCards(playDeck);
        playDeck.remove();
        playDeck.add(drawDeck.pop());
    }
}
