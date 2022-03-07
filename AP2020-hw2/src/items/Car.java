package items;

import users.User;

public class Car extends Good{

    private double price;
    private double distanceTraveled;
    private int manufacturingYear;
    private boolean hadAccident;

    public Car(String name, User user, double price, double distanceTraveled, int manufacturingYear, boolean hadAccident) {
        super(name, user);
        this.price = price;
        this.distanceTraveled = distanceTraveled;
        this.manufacturingYear = manufacturingYear;
        this.hadAccident = hadAccident;
    }


    @Override
    public double getPrice() {
        int flag = 0;
        if (hadAccident) flag = 1;
        return (price / (distanceTraveled / Math.pow(10, 4))) * (flag * 0.3 + (1 - flag)) - (1400 - manufacturingYear);
    }


    public void setPrice(int price) {
        this.price = price;
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
