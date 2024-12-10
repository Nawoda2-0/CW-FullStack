package com.example.OOP_CW_w2051783.controller;

import com.example.OOP_CW_w2051783.model.TicketConfig;
import com.example.OOP_CW_w2051783.service.ConfigHolder;
import com.example.OOP_CW_w2051783.service.ThreadManager;
import com.example.OOP_CW_w2051783.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private ConfigHolder configHolder;

    @Autowired
    private ThreadManager threadManager;


    @PostMapping("/config")
    public ResponseEntity<?> setupTicketPool(@RequestBody TicketConfig ticketConfig) throws IOException {
        System.out.println("Received detail:" + ticketConfig);
        TicketConfig savedTicket = ticketService.saveTicketConfig(ticketConfig);
        configHolder.setCurrentConfig(savedTicket); //update the global congiguration for use ticket information

        threadManager.startThreads();

        return new ResponseEntity<>(savedTicket, HttpStatus.CREATED);
    }



}
