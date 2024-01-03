package com.parking.lot.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ParkingLotResponse {
    private final int floor;
    private final String lotType;
}
