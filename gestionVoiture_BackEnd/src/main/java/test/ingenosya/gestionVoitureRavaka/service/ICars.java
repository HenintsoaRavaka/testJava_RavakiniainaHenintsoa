package test.ingenosya.gestionVoitureRavaka.service;

import test.ingenosya.gestionVoitureRavaka.entity.Car;
import test.ingenosya.gestionVoitureRavaka.entity.Comment;
import test.ingenosya.gestionVoitureRavaka.exception.CarNotFoundException;
import java.util.Set;

public interface ICars {

    Car getCarById(Long carsId) throws CarNotFoundException;
    Set<Car> getAllCar();
    Set<Comment> getCommentsByCarId(Long carsId);
}
