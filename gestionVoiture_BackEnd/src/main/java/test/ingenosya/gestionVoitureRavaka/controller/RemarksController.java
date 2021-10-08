package test.ingenosya.gestionVoitureRavaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import test.ingenosya.gestionVoitureRavaka.entity.Comment;
import test.ingenosya.gestionVoitureRavaka.service.ICars;

import java.util.Set;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class RemarksController {

    @Autowired
    private ICars iCars;

    @GetMapping("/comment/{id}")
    public Set<Comment> getCommentsByCarId(@PathVariable("id") Long carsId) {
        return iCars.getCommentsByCarId(carsId);
    }
}
