package com.parking.lot.repository;

import org.parking.parkinglot.entity.ParkingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingInfoRepository extends JpaRepository<ParkingInfo, Long> {
}
