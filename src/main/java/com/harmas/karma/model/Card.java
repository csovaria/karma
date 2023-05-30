package com.harmas.karma.model;

public class Card {
    private final CardType type;
    private final ColorType color;

    public Card(CardType type, ColorType color) {
        this.type = type;
        this.color = color;
    }

    public Integer getValue() {
        return this.type.getValue();
    }
}
