package Structural.flyweight_pattern;

public class Game {
    public static void main(String[] args) {
        String m416 = "M416";
        String akm = "AKM";
        GunFactory gf = new GunFactory();
        Gun m1 = gf.createGun(m416, 0, 0);
        Gun a1 = gf.createGun(akm, 1, 1);
        Gun m2 = gf.createGun(m416, 1, 0);
        m1.fire();
        m2.fire();
        a1.fire();
        a1.reload();
        Gun a2 = gf.createGun(akm, 2, 3);
        a2.move(3, 4);
        a2.fire();

    }
}
