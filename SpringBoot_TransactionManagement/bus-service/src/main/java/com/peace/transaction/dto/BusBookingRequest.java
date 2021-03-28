package com.peace.transaction.dto;

import com.peace.transaction.entity.PassengerInfo;
import com.peace.transaction.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;

    public void setPassengerInfo(PassengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }
}
