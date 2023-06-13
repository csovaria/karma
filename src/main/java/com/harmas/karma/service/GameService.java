package com.harmas.karma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private DeckService deckService;
    private PlayerService playerService;
    private static final int NUMBER_OF_PLAYERS = 2;
    @Autowired
    public GameService(DeckService deckService, PlayerService playerService) {
        this.deckService = deckService;
        this.playerService = playerService;
    }

    //    public boolean playCardFromHand(List<Card> cards) {
//        return game.playCardFromHand(cards);
//    }
//
//    public List<Card> getCurrentPlayerCards(){
//        return game.getCurrentPlayer().getCards()
//    }
    public void initializeGame() {
        deckService.initializeDrawDeck();
        deckService.playCardFromDrawDeck();
        playerService.instantiatePlayers(NUMBER_OF_PLAYERS);
        handCardsToPlayers(3);
    }

    public void handCardsToPlayers(int numberOfCards){
        playerService.handCardsToPlayers(numberOfCards);
    }
}
