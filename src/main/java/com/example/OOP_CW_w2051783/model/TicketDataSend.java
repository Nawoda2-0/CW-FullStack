package com.example.OOP_CW_w2051783.model;

public class TicketDataSend {

    private int availableTickets;
    private int maxTickets;

    public TicketDataSend() {}

    public TicketDataSend(int availableTickets, int maxTickets) {
        this.availableTickets = availableTickets;
        this.maxTickets = maxTickets;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public int getMaxTickets() {
        return maxTickets;
    }

    public void setMaxTickets(int maxTickets) {
        this.maxTickets = maxTickets;
    }
}
