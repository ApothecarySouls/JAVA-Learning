package CoffeeTask;

public interface Menu {

    Drink createNewDrink(String name, double price);

    void changePrice(String name, double price);

    Drink[] getAllDrinks();
}
