package com.harmas.karma.model;

import java.util.List;
import java.util.UUID;

public class Player {
    private final UUID id;
    private final String name;

    private List<Card> playerDeck;

    public Player(String name, List<Card> playerDeck) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.playerDeck = playerDeck;
    }
}
