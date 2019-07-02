package Practise.Wearhouse;

import Practise.Car;

import java.util.List;

public interface Wearhouse
{
    Car store(Car car);

    Car findByModel(String model);

    List<Car> getAll();
}
