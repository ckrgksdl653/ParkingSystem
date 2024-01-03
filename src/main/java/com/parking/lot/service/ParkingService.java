package com.parking.lot.service;

import lombok.RequiredArgsConstructor;
import org.parking.parkinglot.dto.ParkingLotResponse;
import org.parking.parkinglot.entity.ParkingInfo;
import org.parking.parkinglot.repository.ParkingInfoRepository;
import org.parking.parkinglot.repository.ParkingSpaceRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ParkingService {
    private final ParkingInfoRepository parkingInfoRepository;
    private final ParkingSpaceRepository parkingSpaceRepository;

    public ParkingLotResponse parking(int carNumber, int floor, String lotType) {
        updateParkingInfo(carNumber, floor, lotType);
        updateParkingSpace(carNumber, floor, lotType);
    }

    private void updateParkingSpace(int carNumber, int floor, String lotType) {

    }

    private void updateParkingInfo(int carNumber, int floor, String lotType) {
        ParkingInfo parkingInfo = parkingInfoRepository.getById((long) carNumber);


    }
}
