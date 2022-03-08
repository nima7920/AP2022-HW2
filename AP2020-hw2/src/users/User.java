package users;

import items.Product;
import market.Market;

import java.util.ArrayList;
import java.util.List;

public class User {
    /**
     * User class, with subclasses manager and member
     */
    protected String name;
    protected long phoneNumber;
    protected double credit;
    protected int id;
    protected List<Product> cart;
    protected static int userCount = 1000 * 1000;

    public User(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = userCount++;
        this.cart = new ArrayList<Product>();
    }

    // getters and setters


    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getCredit() {
        return credit;
    }


    public int getId() {
        return id;
    }

    public List<Product> getCart() {
        return cart;
    }

    public double getTotalPrice(){
        double res = 0;
        for (Product product : cart) {
            res += product.getPrice();
        }
        return res;
    }

    public void setCredit(double credit){
        this.credit=credit;
    }

    public void purchase(){
        for(Product product:cart){
            Market.getInstance().purchaseProduct(this,product);
        }
        this.cart.clear();
    }
}
