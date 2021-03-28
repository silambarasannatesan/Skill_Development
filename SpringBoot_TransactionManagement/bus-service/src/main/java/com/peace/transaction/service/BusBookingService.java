package com.peace.transaction.service;

import com.peace.transaction.dto.BusBookingAcknowledgement;
import com.peace.transaction.dto.BusBookingRequest;
import com.peace.transaction.entity.PassengerInfo;
import com.peace.transaction.entity.PaymentInfo;
import com.peace.transaction.repository.PassengerInfoRepository;
import com.peace.transaction.repository.PaymentInfoRepository;
import com.peace.transaction.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class BusBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional(readOnly = false, isolatiopn = Isolation.READ_COMMITTED, propagation = Propagation.MANDATORY)
    public BusBookingAcknowledgement bookBusTicket(BusBookingRequest request) {
        BusBookingAcknowledgement acknowledgement = null;

        PassengerInfo passengerInfo = request.getPassengerInfo();
        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new BusBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("_")[0], passengerInfo);

    }
}
