package com.ipl.points;


import com.ipl.user.User;
import com.ipl.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointsService {
    @Autowired private PointsRepository repo;

    public List<Points> listAll() {
        return (List<Points>) repo.findAll();
    }
}
