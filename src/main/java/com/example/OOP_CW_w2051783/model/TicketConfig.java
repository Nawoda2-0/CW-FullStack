package com.example.OOP_CW_w2051783.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class TicketConfig {

    @Id
    private int id;

    private int numOfVendor;
    private int numOfCustomer;
    private int maxTicketCapacity;
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrieverRate;

    //default constructor
    public TicketConfig(){}

    //All parameter constructor
    public TicketConfig(int id, int numOfVendor, int numOfCustomer, int maxTicketCapacity, int totalTickets, int ticketReleaseRate, int customerRetrieverRate) {
        this.id = id;
        this.numOfVendor = numOfVendor;
        this.numOfCustomer = numOfCustomer;
        this.maxTicketCapacity = maxTicketCapacity;
        this.totalTickets = totalTickets;
        this.ticketReleaseRate = ticketReleaseRate;
        this.customerRetrieverRate = customerRetrieverRate;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumOfVendor() {
        return numOfVendor;
    }

    public void setNumOfVendor(int numOfVendor) {
        this.numOfVendor = numOfVendor;
    }

    public int getNumOfCustomer() {
        return numOfCustomer;
    }

    public void setNumOfCustomer(int numOfCustomer) {
        this.numOfCustomer = numOfCustomer;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    public void setTicketReleaseRate(int ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }

    public int getCustomerRetrieverRate() {
        return customerRetrieverRate;
    }

    public void setCustomerRetrieverRate(int customerRetrieverRate) {
        this.customerRetrieverRate = customerRetrieverRate;
    }

    @Override
    public String toString() {
        return "TicketConfig{" +
                "id=" + id +
                ", numOfVendor=" + numOfVendor +
                ", numOfCustomer=" + numOfCustomer +
                ", maxTicketCapacity=" + maxTicketCapacity +
                ", totalTickets=" + totalTickets +
                ", ticketReleaseRate=" + ticketReleaseRate +
                ", CustomerRetrieverRate=" + customerRetrieverRate +
                '}';
    }
}
