package com.springbootexample.springbootdemo;

import org.springframework.stereotype.Repository;
import com.springbootexample.springbootdemo.Car;
import com.springbootexample.springbootdemo.Cars;

@Repository
public class CarDAO {
	  private static Cars list = new Cars();
	     
	    static
	    {
	        list.getCarList().add(new Car(1, "Toyota", "Vios"));
	        list.getCarList().add(new Car(2, "Honda", "City"));

	    }
	     
	    public Cars getAllCars() 
	    {
	        return list;
	    }
	     
	    public void addCar(Car car) {
	        list.getCarList().add(car);
	    }
}
