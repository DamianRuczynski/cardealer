package com.cardealer.cardealer.controler;

import com.cardealer.cardealer.model.Cars;
import com.cardealer.cardealer.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/cars")
public class CarController {

  private final CarsRepository carsRepository;

  @Autowired
  public CarController(CarsRepository carsRepository) {
    this.carsRepository = carsRepository;
  }

  @GetMapping
  public List<Cars> getAllCars() {
    return carsRepository.findAll();
  }

    @GetMapping (path = "/{id}")
    public Cars getCarById(@PathVariable Long id) {
        return carsRepository.findById(id).orElseThrow(() -> new RuntimeException("client not found"));
    }
}
