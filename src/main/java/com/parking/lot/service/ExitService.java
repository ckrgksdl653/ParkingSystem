package com.parking.lot.service;

import lombok.RequiredArgsConstructor;
import org.parking.parkinglot.entity.ParkingInfo;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ExitService {

    public void exit(int carNumber) {
        ParkingInfo parkingInfo = ParkingInfo.builder().carNumber((long) carNumber).build();
        parkingInfoRepository.save(parkingInfo);
    }
}
