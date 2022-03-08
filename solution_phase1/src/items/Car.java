package items;

import users.User;

public class Car extends Good{

    private double factoryPrice;
    private double distanceTraveled;
    private int manufacturingYear;
    private boolean hadAccident;

    public Car(String name, User user, double factoryPrice, double distanceTraveled, int manufacturingYear, boolean hadAccident) {
        super(name, user);
        this.factoryPrice = factoryPrice;
        this.distanceTraveled = distanceTraveled;
        this.manufacturingYear = manufacturingYear;
        this.hadAccident = hadAccident;
    }


    @Override
    public double getPrice() {
        int flag = 0;
        if (hadAccident) flag = 1;
        return (factoryPrice / (distanceTraveled / Math.pow(10, 4))) * (flag * 0.3 + (1 - flag)) - (1400 - manufacturingYear);
    }

    public double getFactoryPrice() {
        return factoryPrice;
    }

    public void setFactoryPrice(double factoryPrice) {
        this.factoryPrice = factoryPrice;
    }

    public void setPrice(int factoryPrice) {
        this.factoryPrice = factoryPrice;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public boolean isHadAccident() {
        return hadAccident;
    }

    public void setHadAccident(boolean hadAccident) {
        this.hadAccident = hadAccident;
    }
}
