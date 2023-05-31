package com.harmas.karma.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Player {
    private final UUID id;
    private final String name;

    private List<Card> playerDeck;

    public Player(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.playerDeck = new ArrayList<>();
    }

    public void pullCards(List<Card> cards) {
        playerDeck.addAll(cards);
    }

    public void pullCard(Card card) {
        playerDeck.add(card);
    }
}
