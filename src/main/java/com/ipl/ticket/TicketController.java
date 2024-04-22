package com.ipl.ticket;

import com.ipl.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TicketController {
    @Autowired private TicketService service;
    @GetMapping("/ticket")
    public String showTicketList( Model model) {
        List<Ticket> listTicket=service.listAll();
        model.addAttribute("listTicket", listTicket);
        return "ticket";
    }

    @GetMapping("/ticket-booking")
    public String showTicket(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "ticket";
    }

    @PostMapping("/ticket-booked")
    public String saveTicket(Ticket Ticket) {
        service.save(Ticket);
        return "ticket";
    }
}
