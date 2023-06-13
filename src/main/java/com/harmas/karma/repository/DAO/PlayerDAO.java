package com.harmas.karma.repository.DAO;

import com.harmas.karma.model.Card;
import com.harmas.karma.model.Player;

import java.util.List;
import java.util.UUID;

public interface PlayerDAO {
    void savePlayers(List<Player> players);

    void pullCards(List<Card> cards);

    void moveToTheNextPlayer();

    void handCardsToPlayers(List<Card> cards);

    Player getPlayerByID(UUID id);
}
