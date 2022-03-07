package items;

import users.User;

public class Property extends Good{

    private int price;
    private int builtYear;
    private int area;


    public Property(String name, User user, int price, int builtYear, int area, long userID1) {
        super(name, user);
        this.price = price;
        this.builtYear = builtYear;
        this.area = area;
    }

    @Override
    public double getPrice() {
        return Math.pow(10, 10) * this.area * Math.pow(0.98, 1400 - this.builtYear);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

}
