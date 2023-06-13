package com.harmas.karma.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Player {
    private final UUID id;
    private final String name;
    private List<Card> playerDeck;
    private List<UUID> cardIDs;

    public Player(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.playerDeck = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void pullCards(List<Card> cards) {
        playerDeck.addAll(cards);
    }

    public void pullCard(Card card) {
        playerDeck.add(card);
    }

    public List<UUID> getCardIDs() {
        return playerDeck.stream().map(Card::getId)
                .collect(Collectors.toList());
    }
}
