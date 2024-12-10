package com.example.OOP_CW_w2051783.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer extends Thread {

    @Autowired
    private TicketPool pool;

    @Autowired
    private TicketConfig config;

    public Customer(TicketPool pool, TicketConfig config){
        this.pool = pool;
        this.config = config;
    }

    @Override
    public void run() {
        while (!pool.totalTicketArray.isEmpty() || !pool.maxTicketArray.isEmpty()){
            try {
                pool.removeTicket();
                //managing customer retrieve rate
                Thread.sleep(5000/config.getCustomerRetrieverRate());
            }catch (InterruptedException e){
                System.out.println("Customer interrupted");
                break;
            }

        }
    }
}
