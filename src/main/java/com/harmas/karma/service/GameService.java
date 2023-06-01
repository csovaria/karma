package com.harmas.karma.service;

import com.harmas.karma.model.Card;
import com.harmas.karma.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private Game game;
    public boolean playCardFromHand(List<Card> cards) {
        return game.playCardFromHand(cards);
    }
}
