package com.harmas.karma.repository.memory;

import com.harmas.karma.model.Card;
import com.harmas.karma.model.Player;
import com.harmas.karma.repository.DAO.PlayerDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerMemory implements PlayerDAO {

    private List<Player> players;

    private int currentPlayerIndex = 0;

    private final int NUMBEROFPLAYERS = 2;
    @Override
    public void instantiatePlayers() {
        for (int i = 0; i < NUMBEROFPLAYERS; i++){
            players.add(new Player("Player " + i));
        }
    }

    @Override
    public void pullCards(List<Card> cards) {
        players.get(currentPlayerIndex).pullCards(cards);
    }

    @Override
    public void moveToTheNextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1 <= NUMBEROFPLAYERS) ? currentPlayerIndex++ : 0;
    }
}
