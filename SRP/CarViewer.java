package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarViewer
{   
    private DbManager accessDb = new DbManager() ; 
    private List<Car> _cars = accessDb.getAllCars() ;  

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
