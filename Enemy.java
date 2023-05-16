public class Enemy extends Character {
    public void move() {
        System.out.println("Enemy Bergerak");
    }

    public void move(int step){
        System.out.println("Enemy bergerak sebanyak " + step + "step");
    }
}
