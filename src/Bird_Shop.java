public class Bird_Shop {



    public static void main(String[] args)
    {
     Bird bird = new Bird();
     bird.type = "Crow";
     bird.price = 1.0;
     bird.inStock = 20;
     bird.sold = 10;

     Bird[] birds = new Bird[10];
     birds[0] = bird;

        System.out.println(birds[0].type);
    }
}
