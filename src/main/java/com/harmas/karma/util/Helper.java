//package com.harmas.karma.util;
//
//import com.harmas.karma.model.Card;
//import com.harmas.karma.model.CardValue;
//import com.harmas.karma.model.Player;
//import org.springframework.stereotype.Component;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.UUID;
//
//@Component
//public final class Helper {
//    public static boolean isCardCanBePlaced(Card card) {
//    Card topCard = playDeck.getFirst();
//    return card.getValue() >= topCard.getValue()
//            || card.getValue().equals(CardValue.TWO.getValue())
//            || card.getValue().equals(CardValue.TEN.getValue());
//}
//
//
//    public static boolean areCardsValuesEquals(List<Card> cards) {
//        return cards.stream().allMatch(card -> card.getValue().equals(cards.get(0).getValue()));
//    }
//
//
//    public static boolean areCardsCanBePlaced(List<Card> cards) {
//        if (!areCardsValuesEquals(cards)) return false;
//        return isCardCanBePlaced(cards.get(0));
//    }
//
//
//    public static void placeCardsOnPlayDeck(List<Card> cards) {
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
//    public Player getCurrentPlayer() {
//        return currentPlayer;
//    }
//}
