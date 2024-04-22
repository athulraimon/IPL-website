
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
    @Autowired private UserServiceImpl userService;

    @GetMapping("/users")
    public String showUserList(Model model) {
        List<User> listUsers = userService.listAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

    @GetMapping("/users/new")
    public String showNewForm(Model model) {
        model.addAttribute("user", userService.createUser(null, null, null, null));
        return "user_form";
    }

    @PostMapping("/users/save")
    public String saveUser(User user) {
        userService.save(user);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginUser(User user, Model model) {
        if (userService.login(user)) {
            return "redirect:/points";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "index";
        }
    }
}