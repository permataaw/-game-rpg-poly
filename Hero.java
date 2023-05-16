public class Hero extends Character {
    public void move() {
        System.out.println("Hero Bergerak");
    }

    public void move(String direction) {
        System.out.println("Hero Bergerak ke arah " + direction);
    }
}
