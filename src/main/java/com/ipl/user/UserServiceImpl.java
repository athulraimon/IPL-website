package com.ipl.user;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends UserService {

    @Override
    public User createUser(String email, String password, String firstName, String lastName) {
        return new User();
    }
}