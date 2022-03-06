package items;

public class Car extends Good{

    private int price;
    private double used;
    private int builtYear;
    private boolean hadAccident;

    public Car(String name, long userID, int price, double used, int builtYear, boolean hadAccident) {
        super(name, userID);
        this.price = price;
        this.used = used;
        this.builtYear = builtYear;
        this.hadAccident = hadAccident;
    }


    public int getPrice() {
        return price;
    }

    public double getUsed() {
        return used;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public boolean isHadAccident() {
        return hadAccident;
    }
}
