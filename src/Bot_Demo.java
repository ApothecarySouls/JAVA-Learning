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

     Light_Sabre sabre1 = new Light_Sabre();
        sabre1.color = "Red";
        sabre1.style = "Carelian";
        sabre1.blades = 1;

     Light_Sabre sabre2 = new Light_Sabre();
        sabre2.color = "Blue";
        sabre2.style = "Dagobah";
        sabre2.blades = 1;

     Sith_Lord sith1 = new Sith_Lord();
     sith1.name = "Darth Wader";
     sith1.color = "Black";
     sith1.lightSabre = sabre1;


     sith1.movie = "Star Wars";

     Jedi jedi1 = new Jedi();
     jedi1.name = "Obi-Wan-Kenobi";
     jedi1.movie = "Star Wars";
     jedi1.lightSabre = sabre2;

     Force f1 = new Force();
     f1.name = "Lightning";
     f1.mana = 20;
     f1.level = 1;

     Force f2 = new Force();
     f2.name = "Force Push";
     f2.mana = 40;
     f2.level = 2;

     Force[] forces = new Force[2];
     forces[0] = f1;
     forces[1] = f2;

     jedi1.forces = forces;


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
