package com.example.OOP_CW_w2051783.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vendor extends Thread{

    @Autowired
    private TicketPool pool;

    @Autowired
    private TicketConfig config;

    public Vendor(TicketPool pool, TicketConfig config){
        this.pool = pool;
        this.config = config;
    }

    @Override
    public void run() {
        while (!pool.maxTicketArray.isEmpty()){
            try {
                pool.addTicket();
                //managing ticket release rate
                Thread.sleep(5000/config.getTicketReleaseRate());
            } catch (InterruptedException e){
                System.out.println("Vendor interrupted.");
                break;
            }
        }
    }
}
