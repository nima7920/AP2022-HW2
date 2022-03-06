package users;

import items.Product;

import java.util.List;

public class User {
    /**
     * User class, with subclasses manager and member
     */
    protected String name;
    protected long phone;
    protected float credit;
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

    public float getCredit() {
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
}
