package com.harmas.karma.model;

import java.util.List;

public class PlayDeck extends Deck implements EmptyCheckable{

    private boolean isTopCardTen(){
        return this.cards.getLast().getValue().equals(CardValue.TEN.getValue());
    }

    private List<Card> getAllCards(){
        return cards;
    }

    private int getValueOfTopCard(){
        return this.cards.getLast().getValue();
    }

    @Override
    public boolean isEmpty() {
        return this.cards.isEmpty();
    }
}
