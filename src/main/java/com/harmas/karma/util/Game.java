package com.harmas.karma.util;

// TODO  BOILER PLATE, NEED TO REFACTOR THESE METHODS, LOGIC METHODS INTO HELPER CLASS.
// Need to decide the implementation of these validation methods.

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

// @Component
// public class Game {
//    public boolean isCardCanBePlaced(Card card) {
//        Card topCard = playDeck.getFirst();
//        return card.getValue() >= topCard.getValue()
//                || card.getValue().equals(CardValue.TWO.getValue())
//                || card.getValue().equals(CardValue.TEN.getValue());
//    }
//
//
//    public boolean areCardsValuesEquals(List<Card> cards) {
//        return cards.stream().allMatch(card -> card.getValue().equals(cards.get(0).getValue()));
//    }
//
//
//    public boolean areCardsCanBePlaced(List<Card> cards) {
//        if (!areCardsValuesEquals(cards)) return false;
//        return isCardCanBePlaced(cards.get(0));
//    }
//
//
//    public void placeCardsOnPlayDeck(List<Card> cards) {
//        playDeck.addAll(cards);
//    }
//
//
//    public boolean playCardFromHand(List<Card> cards) {
//        if (areCardsCanBePlaced(cards)) {
//            placeCardsOnPlayDeck(cards);
//            return true;
//        }
//        return false;
//    }
//
//
//    public boolean playerHasCards(List<Card> cards) {
//        List<UUID> cardIDs = cards.stream().map(Card::getId).toList();
//        return new HashSet<>(cardIDs).containsAll(currentPlayer.getCardIDs());
//    }
//
//
//    public void drawPlayDeck() {
//        currentPlayer.pullCards(playDeck);
//        playDeck.remove();
//        playDeck.add(drawDeck.pop());
//    }
//
//    public Player getCurrentPlayer() {
//        return currentPlayer;
//    }
//}
