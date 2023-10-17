package ilia.constructor2;

import org.testng.annotations.Test;

public class Car {
    private String model;
    private int year;
    private double fuel;

    public Car(String model, int year, double fuel)
    {
        this.model = model;
        this.year = year;
        this.fuel = fuel;
    }
    public void drive(double distance)
    {
        double fuelConsumption = 10.0;
        double fuelRequired = (distance / 100.0)* fuelConsumption;

        if(fuel >= fuelRequired)
        {
            fuel -= fuelRequired;
            System.out.println("Car " + model + " Drive through " + distance + "km");
        }
        else
        {
            System.out.println("Not enough fuel to travel" + distance + "km");
        }
    }

    public static void main(String[] args)
    {
        Car myCar = new Car("Toyota",2020,50.00);
        myCar.drive(200);
    }
}
