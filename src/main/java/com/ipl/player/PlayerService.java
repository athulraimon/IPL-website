// PlayerService.java

package com.ipl.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private static PlayerService instance;

    @Autowired
    private PlayerRepository repo;

    private PlayerService() {
        // Private constructor to prevent instantiation from outside
    }

    public static synchronized PlayerService getInstance() {
        if (instance == null) {
            instance = new PlayerService();
        }
        return instance;
    }

    public List<Player> listAll() {
        return (List<Player>) repo.findAll();
    }
}