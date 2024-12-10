package com.example.OOP_CW_w2051783.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class TicketPool {


    @Autowired
    private TicketConfig config;

    private final int totalCapacity ;

    public List<String> maxTicketArray = Collections.synchronizedList(new ArrayList<>());
    public List<String> totalTicketArray = Collections.synchronizedList(new ArrayList<>());

    //Constructor for the TicketPool class
    public TicketPool(TicketConfig config) {
        this.config = config;
        this.totalCapacity = config.getTotalTickets();

        // fill the maxTicketArray based on the configuration's max capacity(User input).
        for (int i = 0; i < config.getMaxTicketCapacity(); i++) {
            maxTicketArray.add("MaxTicket-" + (i + 1));
        }
    }


    //method for producer(Vendor)
    public synchronized void addTicket() throws InterruptedException {
        String name = Thread.currentThread().getName();

        while (totalTicketArray.size()==totalCapacity){
            System.out.println("Ticket pool is full " + name + "is waiting for ticket to be sold!");
            System.out.println();
            wait();//wait if the pool is full
        }
        if (!maxTicketArray.isEmpty()){
            totalTicketArray.add("Ticket");
            maxTicketArray.remove(0);
            System.out.println("Vendor " +name+ " added a ticket");
            System.out.println("Current state : \n   Maximum ticket available for produce : " + maxTicketArray.size() +
                        '\n' + "   Total ticket available for sell : " + totalTicketArray.size() );
            System.out.println();


        }else{
            System.out.println("Maximum ticket capacity reached.No more tickets to be produced");
            System.out.println();
        }
        notifyAll(); //notify waiting thread

    }

    //method for consumer(Customer)
    public synchronized void removeTicket() throws InterruptedException {
        String name = Thread.currentThread().getName();
        while (totalTicketArray.isEmpty()){
            System.out.println("Ticket pool is empty. Customer " + name + " is waiting for ticket to be added");
            System.out.println();
            wait(); //wait if the ticket pool is empty
        }

        totalTicketArray.remove(0);
        System.out.println("Customer " + name + " bought a ticket");
        System.out.println("Current state : \n   Maximum ticket available for produce : " + maxTicketArray.size() +
                    '\n' + "   Total ticket available for sell : " + totalTicketArray.size());
        System.out.println();


        notifyAll();
    }




}
