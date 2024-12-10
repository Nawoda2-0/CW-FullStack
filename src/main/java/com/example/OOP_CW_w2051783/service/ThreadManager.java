package com.example.OOP_CW_w2051783.service;

import com.example.OOP_CW_w2051783.model.Customer;
import com.example.OOP_CW_w2051783.model.TicketConfig;
import com.example.OOP_CW_w2051783.model.TicketPool;
import com.example.OOP_CW_w2051783.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreadManager {

    @Autowired
    private ConfigHolder configHolder;

    @Autowired
    private TicketPool ticketPool;



    public void startThreads(){
        while(configHolder.getCurrentConfig() == null){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                throw new RuntimeException("Thread interrupted while waiting for configuration ");
            }
        }

        TicketConfig config = configHolder.getCurrentConfig();
        System.out.println("Configuration Received" + config);

        //setting the input values for use in threads
        int numOfVendor = config.getNumOfVendor();
        int numOfCustomers = config.getNumOfCustomer();
        int maxTicketSize = config.getMaxTicketCapacity();
        int totalTicket = config.getTotalTickets();
        int ticketRR = config.getTicketReleaseRate();
        int customerRR = config.getCustomerRetrieverRate();



        System.out.println("======REAL TIME TICKETING SYSTEM=====");
        System.out.println('\n');

        ticketPool = new TicketPool(config);

        for (int i=0; i< numOfVendor;i++){
            Thread vendor = new Vendor(ticketPool, config);
            vendor.start();
        }
        for (int i = 0; i< numOfCustomers;i++){
            Thread customer = new Customer(ticketPool, config);
            customer.start();
        }

    }

}
