package com.harmas.karma.service;

import com.harmas.karma.model.Player;
import com.harmas.karma.repository.DAO.PlayerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerDAO playerDAO;

    @Autowired
    private DeckService deckService;

    public void instantiatePlayers(int numberOfPlayers) {
        List<Player> players = new ArrayList<>(numberOfPlayers);
        for (int i = 0; i < numberOfPlayers; i++){
            players.add(new Player("Player " + i));
        }
        playerDAO.savePlayers(players);
    }
    public void handCardsToPlayers(int numberOfCards) {
        playerDAO.handCardsToPlayers(deckService.drawCards(numberOfCards));
    }
}
