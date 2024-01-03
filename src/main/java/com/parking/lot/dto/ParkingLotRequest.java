package com.parking.lot.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ParkingLotRequest {
    private final int carNumber;
    private final int floor;
    private final String lotType;
}
