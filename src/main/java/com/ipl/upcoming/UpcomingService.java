package com.ipl.upcoming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpcomingService {

    @Autowired
    private UpcomingRepository repo;

    public List<Upcoming> listAll() {
        return (List<Upcoming>) repo.findAll();
    }
}