package items;

public class Car extends Good{

    private double price;
    private double used;
    private int builtYear;
    private boolean hadAccident;

    public Car(String name, long userID, double price, double used, int builtYear, boolean hadAccident) {
        super(name, userID);
        this.price = price;
        this.used = used;
        this.builtYear = builtYear;
        this.hadAccident = hadAccident;
    }


    @Override
    public double getPrice() {
        int flag = 0;
        if (hadAccident) flag = 1;
        return (price / (used / Math.pow(10, 4))) * (flag * 0.3 + (1 - flag)) - (1400 - builtYear);
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public double getUsed() {
        return used;
    }

    public void setUsed(double used) {
        this.used = used;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public boolean isHadAccident() {
        return hadAccident;
    }

    public void setHadAccident(boolean hadAccident) {
        this.hadAccident = hadAccident;
    }
}
