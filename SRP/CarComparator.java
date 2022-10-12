package com.directi.training.srp.exercise;

public class CarComparator {
     
    private DbManager accessDb = new DbManager(); 
    private  List<Car> _cars = accessDb.getAllCars() ; 
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}