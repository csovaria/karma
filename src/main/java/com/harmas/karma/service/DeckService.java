package com.harmas.karma.service;

import com.harmas.karma.repository.DAO.DeckDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeckService {

    @Autowired
    private DeckDAO deckDAO;

}
