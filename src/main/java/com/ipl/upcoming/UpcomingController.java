package com.ipl.upcoming;

import com.ipl.points.Points;
import com.ipl.points.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UpcomingController {
    @Autowired
    private UpcomingService service;
    @GetMapping("/upcoming")

    public String showUpcomingList( Model model) {
        List<Upcoming> listUpcoming=service.listAll();
        model.addAttribute("listUpcoming", listUpcoming);
        return "upcoming";
    }
}
