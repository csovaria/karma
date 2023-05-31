package com.harmas.karma.model;

public class Card {
    private final CardValue value;
    private final CardColor color;

    public Card(CardValue type, CardColor color) {
        this.value = type;
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
