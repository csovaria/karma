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
    public void savePlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public void pullCards(List<Card> cards) {
        players.get(currentPlayerIndex).pullCards(cards);
    }

    @Override
    public void moveToTheNextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1 <= NUMBEROFPLAYERS) ? currentPlayerIndex++ : 0;
    }

    @Override
    public void handCardsToPlayers(List<Card> cards) {
        players.forEach(player -> player.pullCards(cards));
    }
}
