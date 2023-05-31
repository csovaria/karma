package com.harmas.karma.model;

import java.util.UUID;

public class Card {
    private final UUID id = UUID.randomUUID();
    private final CardValue value;
    private final CardColor color;

    public Card(CardValue value, CardColor color) {
        this.value = value;
        this.color = color;
    }

    public Integer getValue() {
        return this.value.getValue();
    }

    public CardColor getColor() {
        return color;
    }

    public UUID getId() {
        return id;
    }
}
