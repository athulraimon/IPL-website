
package com.ipl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class UserService {
    @Autowired private UserRepository userRepository;

    public List<User> listAll() {
        return (List<User>) userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public boolean login(User user) {
        List<User> userList = (List<User>) userRepository.findAll();
        for (User u : userList) {
            if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public abstract User createUser(String email, String password, String firstName, String lastName);
}