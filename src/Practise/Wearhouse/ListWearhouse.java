package Practise.Wearhouse;

import Practise.Car;

import java.util.ArrayList;
import java.util.List;

public class ListWearhouse implements Wearhouse {

    private List<Car> carList;

    private long currentId;

    public ListWearhouse() {
        System.out.println("ListWhearhouse selected.");
        this.carList = new ArrayList<>();
    }

    @Override
    public Car store(Car car) {

        Car stored = car;
        stored.setId(currentId++);

        carList.add(car);

        return stored;
    }

    @Override
    public Car findByModel(String model) {
        for (Car car : carList) {

            if (car.equals(car.getModel())) {
                return car;
            }
        }
        return null;
    }

        @Override
        public List<Car> getAll() {
            return new ArrayList<>(carList);
        }

}
