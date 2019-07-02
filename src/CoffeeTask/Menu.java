package CoffeeTask;

import java.util.List;

public interface Menu {


     void storeDrink(Drink drink);

    void changePrice(String name, double price);

    List<Drink> getAllDrinks();
}
