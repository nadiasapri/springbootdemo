package com.springbootexample.springbootdemo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/hello")
public class CarController {

	 @Autowired
	    private CarDAO carDao;
	     
	    @GetMapping(path="/", produces = "application/json")
	    public Cars getCars() 
	    {
	        return carDao.getAllCars();
	    }
	     
	    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
	    public ResponseEntity<Object> addCar(@RequestBody Car car) 
	    {
	        Integer id = carDao.getAllCars().getCarList().size() + 1;
	        car.setId(id);
	         
	        carDao.addCar(car);
	         
	        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
	                                    .path("/{id}")
	                                    .buildAndExpand(car.getId())
	                                    .toUri();
	         
	        return ResponseEntity.created(location).build();
	    }
	    
}
