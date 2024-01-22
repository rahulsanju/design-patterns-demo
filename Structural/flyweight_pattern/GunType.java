package Structural.flyweight_pattern;

public abstract class GunType {
    String gunType;
    int[][][] image;
    int maxCapacity;

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public int[][][] getImage() {
        return image;
    }

    public void setImage(int[][][] image) {
        this.image = image;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
