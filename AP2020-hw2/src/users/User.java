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
    protected int id;
    protected List<Product> cart;

    public User(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }


}
