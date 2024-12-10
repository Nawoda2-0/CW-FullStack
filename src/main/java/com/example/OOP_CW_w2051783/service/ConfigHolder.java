package com.example.OOP_CW_w2051783.service;

import com.example.OOP_CW_w2051783.model.TicketConfig;
import org.springframework.stereotype.Service;

@Service
public class ConfigHolder {

    private TicketConfig currentConfig;

    public synchronized TicketConfig getCurrentConfig() {
        return currentConfig;
    }

    public synchronized void setCurrentConfig(TicketConfig config) {
        this.currentConfig = config;
    }

}
