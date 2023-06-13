package com.harmas.karma.repository.DAO;

import com.harmas.karma.model.Card;
import com.harmas.karma.model.Player;

import java.util.List;

public interface PlayerDAO {
    void savePlayers(List<Player> players);

    void pullCards(List<Card> cards);

    void moveToTheNextPlayer();
}
