package Practise.Wearhouse;

import Practise.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWearhouse implements Wearhouse {

    private Map<String, Car> carMap;

    private long currentId = 1;

    public MapWearhouse() {
        System.out.println("MapStorage selected.");
        this.carMap = new HashMap<>();

    }

    @Override
    public Car store(Car car) {

        car.setId(currentId++);
        carMap.put(car.getModel(), car);

        return car;
    }

    @Override
    public Car findByModel(String model) {

        return carMap.get(model);
    }

    @Override
    public List<Car> getAll() {
//        return new ArrayList<>(carList);
        return new ArrayList<>(carMap.values());
    }
}
