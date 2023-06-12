package com.harmas.karma.repository.DAO;

import com.harmas.karma.model.Card;

import java.util.List;

public interface PlayerDAO {
    void instantiatePlayers();

    void pullCards(List<Card> cards);

    void moveToTheNextPlayer();
}
