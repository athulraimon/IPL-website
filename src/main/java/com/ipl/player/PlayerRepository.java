package com.ipl.player;

import com.ipl.ticket.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}