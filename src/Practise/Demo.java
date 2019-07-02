package Practise;

import Practise.Wearhouse.ListWearhouse;
import Practise.Wearhouse.Wearhouse;

public class Demo
{
    public static void main(String[] args) {
        Garage garage = new Garage();

        Wearhouse wearhouse = new ListWearhouse();

        garage.setStorage(wearhouse);

        garage.createCar("Toyota", 3000.00);
        garage.createCar("Renault", 2500.00);
        garage.createCar("Ferrary", 5000.00);

        garage.printSore();
    }

//    public static Wearhouse chooseStorage(String[] args)
//    {
//        if (args.length > 0 && "map".equals(args[0]))
//        {
//            return new MapStorage();
//        }
//        return new ListStorage();
    }

