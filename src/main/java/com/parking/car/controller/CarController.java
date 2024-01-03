package com.parking.car.controller;

import com.parking.car.dto.CarRequest;
import com.parking.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2")
public class CarController {
    private final CarService carService;

    @PostMapping("/car/register/light")
    public ResponseEntity<Void> registerLightCar(@RequestBody CarRequest carRequest) {
        carService.registerLightCar(carRequest.getCarNumber());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/car/register/employee")
    public ResponseEntity<Void> registerEmployeeCar(@RequestBody CarRequest carRequest) {
        carService.registerEmployeeCar(carRequest.getCarNumber());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/car/register/Disabled")
    public ResponseEntity<Void> registerDisabledCar(@RequestBody CarRequest carRequest) {
        carService.registerDisabledCar(carRequest.getCarNumber());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/car/delete/light")
    public void deleteLightCar() {

    }

    @DeleteMapping("/car/delete/employee")
    public void deleteEmployeeCar() {

    }

    @DeleteMapping("/car/delete/Disabled")
    public void deleteDisabledCar() {

    }
}
