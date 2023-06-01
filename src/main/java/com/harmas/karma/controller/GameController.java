package com.harmas.karma.controller;

import com.harmas.karma.model.Card;
import com.harmas.karma.model.CardColor;
import com.harmas.karma.model.CardValue;
import com.harmas.karma.service.GameService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public List<Card> sendList(){
        List<Card> list = new ArrayList<>();
        list.add(new Card(CardValue.EIGHT, CardColor.SPADES));
        return list;
    }

    @PostMapping("/play-card-from-hand")
    public void playCard(@RequestBody List<Card> cards, HttpServletResponse response){
        System.out.println(cards.toString());
        if (gameService.playCardFromHand(cards)){
            response.setStatus(HttpServletResponse.SC_ACCEPTED);
        }
        else{
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
        }
    }
}
