package com.parking.lot.repository;

import org.parking.parkinglot.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Long> {
}
