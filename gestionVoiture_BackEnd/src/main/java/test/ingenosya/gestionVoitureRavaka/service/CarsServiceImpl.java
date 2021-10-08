package test.ingenosya.gestionVoitureRavaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.ingenosya.gestionVoitureRavaka.entity.Car;
import test.ingenosya.gestionVoitureRavaka.entity.Comment;
import test.ingenosya.gestionVoitureRavaka.exception.CarNotFoundException;
import test.ingenosya.gestionVoitureRavaka.repository.CarsRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CarsServiceImpl implements ICars{

    @Autowired
    private CarsRepository carsRepository;

    @Override
    public Car getCarById(Long carsId) throws CarNotFoundException {
        Optional<Car> car =  carsRepository.findById(carsId);
        if(!car.isPresent()) {
            throw new CarNotFoundException("Car not found.");
        }
        return car.get();
    }

    @Override
    public Set<Car> getAllCar() {
        List<Car> listCar = carsRepository.findAll();
        return new HashSet<>(listCar);
    }

    @Override
    public Set<Comment> getCommentsByCarId(Long carsId) {
        try {
            Car car = getCarById(carsId);
            return car.getComments();
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
