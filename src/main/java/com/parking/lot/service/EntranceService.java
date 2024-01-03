package com.parking.lot.service;

import lombok.RequiredArgsConstructor;
import org.parking.parkinglot.entity.ParkingInfo;
import org.parking.parkinglot.repository.ParkingInfoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class EntranceService {
    private final ParkingInfoRepository parkingInfoRepository;

    public void entrance(int carNumber) {
        ParkingInfo parkingInfo = ParkingInfo.builder().carNumber((long) carNumber).build();
        parkingInfoRepository.save(parkingInfo);
    }
}
