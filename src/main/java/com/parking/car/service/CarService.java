package com.parking.car.service;

import com.parking.car.entity.Car;
import com.parking.car.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public boolean registerLightCar(long carNumber) {
        Car lightCar = makeCarInfo(carNumber, "L");
        carRepository.save(lightCar);
        return true;
    }

    public boolean registerDisabledCar(long carNumber) {
        Car disabledCar = makeCarInfo(carNumber, "D");
        carRepository.save(disabledCar);
        return true;
    }

    public boolean registerEmployeeCar(long carNumber) {
        Car employeeCar = makeCarInfo(carNumber, "E");
        carRepository.save(employeeCar);
        return true;
    }

    private Car makeCarInfo(long carNumber, String carType) {
        return Car.builder()
                .carNumber(carNumber)
                .carType(carType).build();
    }

    public void deleteLightCar(long carNumber) {

    }

    public void deleteDisabledCar(long carNumber) {

    }

    public void deleteEmployeeCar(long carNumber) {

    }

}
