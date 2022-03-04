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
}
