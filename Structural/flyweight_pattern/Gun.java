package Structural.flyweight_pattern;

public class Gun {
    int currCapacity;
    int xCoord;
    int yCoord;

    GunType gunType;

    public Gun(GunType gunType, int x, int y){
        this.gunType = gunType;
        this.xCoord = x;
        this.yCoord = y;
        this.currCapacity = this.gunType.maxCapacity;
    }


    public void fire() {
        if (this.currCapacity > 0) {
            currCapacity -= 1;
            System.out.println(String.format("%s  - shot",this.gunType.gunType));
        }
    }

    public void reload(){
        currCapacity = this.gunType.maxCapacity;
        System.out.println(String.format("%s  -  reloaded",this.gunType.gunType));
    }

    public void move(int x, int y){
        this.xCoord = x;
        this.yCoord = y;
        System.out.println(String.format("%s  -  position changed",this.gunType.gunType));
    }
}
