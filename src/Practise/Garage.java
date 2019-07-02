package Practise;

import Practise.Wearhouse.Wearhouse;

public class Garage {
    private Wearhouse wearhouse;

    public Garage()  {}

    public void createCar(String model, double price) {
        Car car = new Car();

        car.setModel(model);
        car.setPrice(price);

        wearhouse.store(car);
    }

    public void printSore()
    {
        for (Car car : wearhouse.getAll()) {
            System.out.println(car);
        }
    }

    public void setStorage(Wearhouse wearhouse)
    {
        this.wearhouse = wearhouse;
    }
}
