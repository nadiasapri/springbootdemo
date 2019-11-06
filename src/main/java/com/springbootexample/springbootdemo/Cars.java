package com.springbootexample.springbootdemo;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	 private List<Car> carList;
     
	    public List<Car> getCarList() {
	        if(carList == null) {
	            carList = new ArrayList<>();
	        }
	        return carList;
	    }
	  
	    public void setCarList(List<Car> carList) {
	        this.carList = carList;
	    }
}
