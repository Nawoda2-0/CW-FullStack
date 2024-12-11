package com.example.OOP_CW_w2051783.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final TicketWebSocketHandler ticketWebSocketHandler;
    private final LogWebSocketHandler logWebSocketHandler;


    public WebSocketConfig(TicketWebSocketHandler ticketWebSocketHandler, LogWebSocketHandler logWebSocketHandler) {
        this.ticketWebSocketHandler = ticketWebSocketHandler;
        this.logWebSocketHandler = logWebSocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(ticketWebSocketHandler, "/ticket-updates").setAllowedOrigins("*");
        registry.addHandler(logWebSocketHandler, "/log-updates").setAllowedOrigins("*");
    }
}