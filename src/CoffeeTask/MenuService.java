package CoffeeTask;
public class MenuService implements Menu

{
    private Drink[] drinkMenu = new Drink[10];

    private int counter = 0;

    @Override
    public Drink createNewDrink(String name, double price) {

        Drink newDrink = new Drink("oo", 8);
        newDrink.setName(name);
        newDrink.setPrice(price);

        drinkMenu[counter] = newDrink;
        counter++;

        return newDrink;

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

    @Override
    public Drink[] getAllDrinks() {

        return drinkMenu;
    }
}
