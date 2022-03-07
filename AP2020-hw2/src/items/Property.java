package items;

public class Property extends Good{

    private int price;
    private int builtYear;
    private int area;
    private long userID;

    public Property(String name, long userID, int price, int builtYear, int area, long userID1) {
        super(name, userID);
        this.price = price;
        this.builtYear = builtYear;
        this.area = area;
        this.userID = userID1;
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

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
}
