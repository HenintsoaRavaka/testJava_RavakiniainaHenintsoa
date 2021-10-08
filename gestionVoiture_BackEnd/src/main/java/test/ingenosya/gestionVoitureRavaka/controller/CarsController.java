package test.ingenosya.gestionVoitureRavaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.ingenosya.gestionVoitureRavaka.entity.Car;
import test.ingenosya.gestionVoitureRavaka.exception.CarNotFoundException;
import test.ingenosya.gestionVoitureRavaka.service.ICars;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class CarsController {

    @Autowired
    private ICars iCars;

    @GetMapping("/car/{id}")
    public Car findCarById(@PathVariable("id") Long carsId) throws CarNotFoundException {
        return iCars.getCarById(carsId);
    }

    @GetMapping("/car")
    public Set<Car> getAllCar() {
        return iCars.getAllCar();
    }
}
