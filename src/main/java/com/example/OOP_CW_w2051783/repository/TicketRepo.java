package com.example.OOP_CW_w2051783.repository;

import com.example.OOP_CW_w2051783.model.TicketConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<TicketConfig, Long> {

}
