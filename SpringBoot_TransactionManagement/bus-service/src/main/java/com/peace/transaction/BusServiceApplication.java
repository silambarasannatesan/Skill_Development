package com.peace.transaction;

import com.peace.transaction.dto.BusBookingAcknowledgement;
import com.peace.transaction.dto.BusBookingRequest;
import com.peace.transaction.service.BusBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class BusServiceApplication {

    @Autowired
    private BusBookingService busBookingService;

    @PostMapping("/bookBusTicket")
    public BusBookingAcknowledgement bookBusTicket(BusBookingRequest request) {
        return busBookingService.bookBusTicket(request);
    }

    public static void main(String[] args) {
        SpringApplication.run(BusServiceApplication.class, args);
    }

}
