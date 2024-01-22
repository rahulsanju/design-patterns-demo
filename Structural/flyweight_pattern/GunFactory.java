package Structural.flyweight_pattern;

import java.util.HashMap;

public class GunFactory {
    HashMap<String, GunType> cache = new HashMap<>();

    public Gun createGun(String type, int x, int y){
        GunType gunType;
        if (this.cache.get(type) == null){
            switch (type){
                case "M416":
                    cache.put(type, new M416Gun(type));
                    System.out.println("M416 Created");
                    break;
                case "AKM":
                    cache.put(type, new AKMGun(type));
                    System.out.println("AKM Created");
                    break;
                default:
                    System.out.println("No Such Type found!");
                    return null;
            }
        }
        gunType = this.cache.get(type);
        return new Gun(gunType,x,y);
    }

}
