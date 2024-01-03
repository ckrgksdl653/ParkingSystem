package com.parking.lot.service;

import com.parking.lot.entity.ParkingInfo;
import com.parking.lot.repository.ParkingInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ExitService {
    private ParkingInfoRepository parkingInfoRepository;

    public void exit(int carNumber) {
        ParkingInfo parkingInfo = ParkingInfo.builder().carNumber((long) carNumber).build();
        parkingInfoRepository.save(parkingInfo);
    }
}
