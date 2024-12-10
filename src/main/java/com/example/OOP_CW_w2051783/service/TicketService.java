package com.example.OOP_CW_w2051783.service;

import com.example.OOP_CW_w2051783.model.TicketConfig;
import com.example.OOP_CW_w2051783.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepo ticketRepo;

    public TicketConfig saveTicketConfig(TicketConfig ticketConfig) {
        ticketConfig.setId(1);
        return ticketRepo.save(ticketConfig);
    }
}
