package IteratorsAndCollections;

import CoffeeTask.Drink;

import java.sql.SQLOutput;
import java.util.*;

public class ListDemo {
    static String[] namesArray = {"Oleg", "Alex", "Nina", "Irina", "Alex", "Alex", "Nina", "Irina"};

    public static void main(String[] args) {

        List<Drink> drinksList = new ArrayList<>();

        drinksList.add(new Drink("Coffee", 10));
        drinksList.add(new Drink("Double Coffee", 12));
        drinksList.add(new Drink("Capucino", 10));
        drinksList.add(new Drink("Latte", 10));

        Map<Double, List<Drink>> map = new HashMap<>();

        for (Drink drink : drinksList)
        {
            if (!map.containsKey(drink.getPrice()))
            {
                map.put(drink.getPrice(), new ArrayList<>());
            }

            map.get(drink.getPrice()).add(drink);
        }

        System.out.println(map);

//        Map<String, Integer> nameToLenght = new HashMap<>();
//
//        for (String name : namesArray) {
//            nameToLenght.put(name, name.length());
//        }
//
//        System.out.println(nameToLenght);
//
//        if (nameToLenght.containsKey("Nina"))
//        {
//            System.out.println("Value of Nina: " + nameToLenght.get("Nina"));
//        }
//
//        for (Map.Entry<String, Integer> entry : nameToLenght.entrySet())
//        {
//            System.out.print(entry.getKey());
//            System.out.print(":");
//            System.out.print(entry.getValue());
//            System.out.print(":");
        }
    }

//        Iterator<String> iterator = stringList.iterator();
//
//        while (iterator.hasNext())
//        {
//            String currentName = iterator.next();
//
//            if (currentName.equals("Alex"))
//            {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(stringList);
//
//        Set<String> names = new TreeSet<>(new NamesReverseOrder());
//
//        names.addAll(Arrays.asList(namesArray));
//
//        System.out.println(names);
//    }
//
//    static class NamesReverseOrder implements Comparator<String>
//    {
//        @Override
//        public int compare(String s1, String s2)
//        {
//            return s2.compareTo(s1);
//        }
//    }


