package Structural.flyweight_pattern;

public class Weapon {
    int weaponType;
    int colorType;

    int maxCapacity;


    int xCoord;
    int yCoord;

    int currCapacity;


    public void fire() {
        currCapacity -= 1;
        System.out.println("Shoot");
    }

    public void reload(){
        currCapacity = maxCapacity;
        System.out.println("reloaded");
    }

    public void setPosition(int x, int y){
        this.xCoord = x;
        this.yCoord = y;
        System.out.println("position changed");
    }
}
