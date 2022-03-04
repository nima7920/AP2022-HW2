package users;

import items.Product;

import java.util.List;

public class User {
    /**
     * User class, with subclasses manager and member
     */
    private String name;
    private long phone;
    private float credit;
    private boolean active;
    private int id;
    private List<Product> cart;

    public User(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }


}
