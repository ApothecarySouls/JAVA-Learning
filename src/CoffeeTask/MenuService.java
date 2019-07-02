package CoffeeTask;

import java.util.ArrayList;
import java.util.List;

public class MenuService implements Menu

{
    public List<Drink> drinkMenu = new ArrayList<>();

//    creates Array to store drinks

    public void storeDrink(Drink drink)
    {
        drinkMenu.add(drink);

    }


    @Override
    public void changePrice(String name, double price) {

        for (Drink drink : drinkMenu) {
            if (drink.getName().equals(name))
            {
                drink.setPrice(price);
            }
        }
    }
    // Changes price of a Drink

    @Override
    public List<Drink> getAllDrinks()
    {
        List<Drink> allDrinks = drinkMenu;

        return allDrinks;
    }
    // Returns the Array with all drinks
}
