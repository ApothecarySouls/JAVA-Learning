public class Bot_Demo {

    public static void main(String[] args)
    {
     Bot bot1 = new Bot();
     bot1.model = "R2-D2";
     bot1.movie = "Star Wars";
     bot1.color = "white and blue";

     Bot bot2 = new Bot();
     bot2.model = "C3-PO";
     bot2.movie = "Star Wars";
     bot2.color = "gold";

     Sith_Lord sith1 = new Sith_Lord();
     sith1.name = "Darth Wader";
     sith1.color = "Black";
     sith1.lightSabareColor = "Red";
     sith1.movie = "Star Wars";

     Jedi jedi1 = new Jedi();
     jedi1.name = "Obi-Wan-Kenobi";
     jedi1.movie = "Star Wars";
     jedi1.lightSaberColor = "blue";

     separator();
     jedi1.who();
     separator();
     jedi1.joke();
     separator();

//     sith1.who();
//     sith1.voice();
//     sith1.sithPrhase();
//     sith1.joke();
//     separator();
//     bot1.who();
//     bot1.hitBot();
//     bot1.petBot();
//     separator();
//     bot2.who();
//     separator();
    }
    public static void separator()
    {
        System.out.println("---------------------------");
    }
}
