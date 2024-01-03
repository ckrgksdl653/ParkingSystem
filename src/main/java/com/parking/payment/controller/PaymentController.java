package com.parking.payment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2")
public class PaymentController {

    @GetMapping("/payment/fee/{carNumber}")
    public long getParkingFee(@PathVariable Long carNumber) {

    }

    @PostMapping("/payment/card")
    public void payCard() {

    }

    @PostMapping("/payment/cash")
    public void payCash() {

    }
}
