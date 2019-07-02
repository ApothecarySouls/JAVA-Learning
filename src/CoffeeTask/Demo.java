package CoffeeTask;

import java.util.ArrayList;
import java.util.List;

public class Demo
{

    public static void main(String[] args)
    {

    MenuService menuService = new MenuService();
    CoffeeShop coffeeShop = new CoffeeShop();
    coffeeShop.setMenu(menuService);

    coffeeShop.startShop();


        coffeeShop.createNewDrink("Americano", 6.50);
        coffeeShop.createNewDrink("Cappuccino", 8.00);
        coffeeShop.createNewDrink("Latte", 9.00);
        coffeeShop.createNewDrink("Ice Coffee", 8.50);
        coffeeShop.createNewDrink("Green Tea",4.00);

//    menuService.createNewDrink("Coffee", 12.0 );
//    menuService.createNewDrink("Tea", 10.0 );
//    menuService.createNewDrink("Milk", 5.0 );
//
////        System.out.println("Coffee Shop: Menu");
////        System.out.println("___________________");
//        System.out.println(menuService.getAllDrinks());

    }
}
