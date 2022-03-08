package users;

import items.Product;

import java.util.List;

public class User {
    /**
     * User class, with subclasses manager and member
     */
    protected String name;
    protected long phone;
    protected double credit;
    protected boolean active;
    protected long id;
    protected List<Product> cart;

    public User(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    // getters and setters


    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public double getCredit() {
        return credit;
    }

    public boolean isActive() {
        return active;
    }

    public long getId() {
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
}