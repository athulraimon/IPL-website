package com.ipl.teams;

import com.ipl.player.Player;
import com.ipl.player.PlayerService;
import com.ipl.upcoming.Upcoming;
import com.ipl.upcoming.UpcomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeamController {

    @Autowired
    private TeamService teamService;
    @Autowired
    private PlayerService playerService;

    @GetMapping("/teams")
    public String showUpcomingList( Model model) {
        List<Team> listTeam=teamService.listAll();
        model.addAttribute("listTeam", listTeam);
        List<Player> listPlayer=playerService.listAll();
        model.addAttribute("listPlayer", listPlayer);
        return "teams";
    }
}
