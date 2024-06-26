package com.ipl.teams;

import com.ipl.user.User;
import com.ipl.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired private TeamRepository repo;

    public List<Team> listAll() {
        return (List<Team>) repo.findAll();
    }


}
