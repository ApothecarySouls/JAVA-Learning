package CoffeeTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop
{

    private Menu menu;

    public void createNewDrink(String name, double price)
    {
        Drink newDrink = new Drink();
        newDrink.setName(name);
        newDrink.setPrice(price);

        menu.storeDrink(newDrink);
    }


        public void startShop()
        {
    createNewDrink("Americano", 6.50);
    createNewDrink("Cappuccino", 8.00);
    createNewDrink("Latte", 9.00);
    createNewDrink("Ice Coffee", 8.50);
    createNewDrink("Green Tea",4.00);
    System.out.println(menu.getAllDrinks());

    // This code is generating test data for Demo

    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
