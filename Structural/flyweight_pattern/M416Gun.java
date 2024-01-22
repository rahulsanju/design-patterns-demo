package Structural.flyweight_pattern;

public class M416Gun extends GunType{
    public M416Gun(String gunType){
        this.gunType = gunType;
        this.image = new int[][][]{{{1,1,1},{2,2,2},{3,3,3}}};
        this.maxCapacity = 500;
    }
}
