package com.parking.lot.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Builder
@Table(name = "PARKING_SPACE")
public class ParkingSpace {
    @Id
    @Column(name = "SPACE_ID")
    private Long spaceId;

    @Column(name = "FLOOR")
    private long floor;

    @Column(name = "LOT_TYPE")
    private String lotType;

    @Column(name = "REMAIN_SPACE")
    private long remainSpace;


    public ParkingSpace() {

    }
}
