package com.ipl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired private UserService service;

    @GetMapping("/users")
    public String showUserList(Model model) {
        List<User> listUsers=service.listAll();
        model.addAttribute("listUsers", listUsers);

        return "users" ;
    }

    @GetMapping("/users/new")
    public String showNewForm(Model model) {
        model.addAttribute("user", new User());
        return "user_form";
    }

    @PostMapping("/users/save")
    public String saveUser(User user) {
        service.save(user);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginUser(User user, Model model) {
        List<User> userList = service.listAll();
        for (User u : userList) {
            if (u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
                // Authentication successful, redirect to the user list page
                return "redirect:/dashboard";
            }
        }

        // If no match found, add an error message to the model and return to the login page
        model.addAttribute("error", "Invalid username or password");
        return "index";
    }



}
