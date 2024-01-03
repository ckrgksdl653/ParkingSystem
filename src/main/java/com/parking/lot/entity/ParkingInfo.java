package com.parking.lot.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@Table(name = "PARKING_INFO")
public class ParkingInfo {
    @Id
    @Column(name = "CAR_NUMBER")
    private Long carNumber;

    @CreatedDate
    @Column(name = "ENTRANCE_TIME")
    private LocalDateTime entranceTime;

    @Column(name = "FLOOR")
    private long floor;

    @Column(name = "LOT_TYPE")
    private String lotType;

    @Column(name = "PAYMENT")
    private String payment;

    public ParkingInfo() {

    }
}
