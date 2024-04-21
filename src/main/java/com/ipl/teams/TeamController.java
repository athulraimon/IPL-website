package com.ipl.teams;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    @GetMapping("/teams")
    public String teams() {
        return "teams";
    }
}
