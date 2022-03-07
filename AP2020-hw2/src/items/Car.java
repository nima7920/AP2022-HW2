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
