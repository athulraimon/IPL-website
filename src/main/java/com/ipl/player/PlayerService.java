package com.ipl.player;

import com.ipl.user.User;
import com.ipl.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired private PlayerRepository repo;

    public List<Player> listAll() {
        return (List<Player>) repo.findAll();
    }


}
