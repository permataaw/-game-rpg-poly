public class App {
    public static void main(String[] args) {
        // Ni Nyoman Dinda Permata(225150607111034)
        //static polymorfisme
        Hero hero = new Hero();
        hero.move();
        hero.move("kiri\n");

        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(10);

        System.out.println("=============");
        
        //Dynamic polymorfisme
        Character C1 = new Hero();
        Character C2 = new Enemy();
        Character C3 = new Fighter();
        Character C4 = new Witch();

        C1.move();
        C2.move();
        C3.move();
        C4.move();

        System.out.println("=============");

        //Dynamic polymorfisme Metode Casting

        Character witch = new Witch();
        ((Fighter)witch).move();
        
        


    }
}
