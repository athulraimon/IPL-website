package com.ipl.points;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PointsController {
    @Autowired private PointsService service;
    @GetMapping("/points")

        public String showPointsList( Model model) {
        List<Points> listPoints=service.listAll();
        model.addAttribute("listPoints", listPoints);
        return "points";
    }
}
