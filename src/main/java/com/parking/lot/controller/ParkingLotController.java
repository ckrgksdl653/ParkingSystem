package com.parking.lot.controller;

import lombok.RequiredArgsConstructor;
import org.parking.parkinglot.dto.ParkingLotRequest;
import org.parking.parkinglot.dto.ParkingLotResponse;
import org.parking.parkinglot.service.EntranceService;
import org.parking.parkinglot.service.ParkingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2")
public class ParkingLotController {
    private final EntranceService entranceService;
    private final ParkingService parkingService;

    @GetMapping("/entrance/{carNumber}")
    public void entrance(@PathVariable("carNumber") int carNumber) {
        entranceService.entrance(carNumber);
    }

    @GetMapping("/exit")
    public void exit() {

    }

    @PostMapping("/parking")
    public ParkingLotResponse parking(ParkingLotRequest parkingLotRequest) {
        return parkingService.parking(parkingLotRequest.getCarNumber(), parkingLotRequest.getFloor(), parkingLotRequest.getLotType());
    }

}
