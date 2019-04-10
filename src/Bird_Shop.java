public class Bird_Shop {

    public static int NAME = 0;
    public static int PRICE = 1;
    public static int IN_STOCK = 2;
    public static int SOLD = 3;
    public static int NUMBER_OF_FIELDS = 4;

    public static int CROW = 0;
    public static int EAGLE = 1;
    public static int DUCK = 2;
    public static int NUMBER_OF_BIRDS = 3;

    // New way of DB creation as an Array of Objects
    static Bird[] birdsBase = new Bird[NUMBER_OF_BIRDS];

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        bird1.type = "Crow";
        bird1.price = 1.0;
        bird1.inStock = 23;
        bird1.sold = 3;

        Bird bird2 = new Bird();
        bird2.type = "Eagle";
        bird2.price = 5.0;
        bird2.inStock = 24;
        bird2.sold = 1;

        Bird bird3 = new Bird();
        bird3.type = "Duck";
        bird3.price = 0.5;
        bird3.inStock = 27;
        bird3.sold = 23;

        birdsBase[CROW] = bird1;
        birdsBase[EAGLE] = bird2;
        birdsBase[DUCK] = bird3;


//        System.out.println(Arrays.deepToString(birdsBase));
//
//
//        System.out.println(Arrays.deepToString(birdsBase));
//
//        addToStock(birdsBase, DUCK, 5);
//
//        demo();
//
//        soldStats();


//Methods of my Bird base:


    }
    public static String[] newBird(String name, double price, int inStock) //Creates new Bird in stock
    {
        String[] newBird = new String[NUMBER_OF_FIELDS];

        newBird[NAME] = name;
        newBird[PRICE] = String.valueOf(price);
        newBird[IN_STOCK] = String.valueOf(inStock);
        newBird[SOLD] = "0";

        return newBird;

    }

    public static String[] sellBird (String[][] birdsBase, int birdType, int amount) //Sells the bird of current type
    {
        int inStock = Integer.parseInt(birdsBase[birdType][IN_STOCK]);
        int result1 = inStock - amount;
        birdsBase[birdType][IN_STOCK] = String.valueOf(result1);

        int sold = Integer.parseInt(birdsBase[birdType][SOLD]);
        int result2 = sold + amount;
        birdsBase[birdType][SOLD] = String.valueOf(result2);

        return birdsBase[birdType];

    }

    public static String[] addToStock (String[][] birdsBase, int birdType, int amount) //Adds the bird of current type to stock
    {
        int inStock = Integer.parseInt(birdsBase[birdType][IN_STOCK]);
        int result1 = inStock + amount;
        birdsBase[birdType][IN_STOCK] = String.valueOf(result1);

        return birdsBase[birdType];
    }

    public static void demo() //Shows current base state
    {
        System.out.println("\nCrows info: " +
                "\n- Price -- " + birdsBase[CROW][PRICE] +
                "\n- In stock -- " + birdsBase[CROW][IN_STOCK] +
                "\n- Sold -- " + birdsBase[CROW][SOLD]);

        System.out.println("\nEagles info: " +
                "\n- Price -- " + birdsBase[EAGLE][PRICE] +
                "\n- In stock -- " + birdsBase[EAGLE][IN_STOCK] +
                "\n- Sold -- " + birdsBase[EAGLE][SOLD]);

        System.out.println("\nDucks info: " +
                "\n- Price -- " + birdsBase[DUCK][PRICE] +
                "\n- In stock -- " + birdsBase[DUCK][IN_STOCK] +
                "\n- Sold -- " + birdsBase[DUCK][SOLD]);

    }

    public static void soldStats() //Shows the statistics of sell
    {
        System.out.println("\nBirds sell totals: ");

        int birdsSoldC = Integer.parseInt(birdsBase[CROW][SOLD]);
        double priceC = Double.parseDouble(birdsBase[CROW][PRICE]);
        double earnedC = birdsSoldC * priceC;

        System.out.println("\nCrows sold: " + birdsBase[CROW][SOLD] + ", Earned --> " + earnedC);

        int birdsSoldE = Integer.parseInt(birdsBase[EAGLE][SOLD]);
        double priceE = Double.parseDouble(birdsBase[EAGLE][PRICE]);
        double earnedE = birdsSoldE * priceE;

        System.out.println("\nEagles sold: " + birdsBase[EAGLE][SOLD] + ", Earned --> " + earnedE);

        int birdsSoldD = Integer.parseInt(birdsBase[DUCK][SOLD]);
        double priceD = Double.parseDouble(birdsBase[DUCK][PRICE]);
        double earnedD = birdsSoldD * priceD;

        System.out.println("\nDucks sold: " + birdsBase[DUCK][SOLD] + ", Earned --> " + earnedD);

    }

}
