package Structural.flyweight_pattern;

public class AKMGun extends GunType{
    public AKMGun(String gunType){
        this.gunType = gunType;
        this.image = new int[][][]{{{0,0,0},{2,2,2},{4,4,4}}};
        this.maxCapacity = 700;
    }
}

