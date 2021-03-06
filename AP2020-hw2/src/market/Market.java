package market;

import items.Good;
import items.Product;
import items.Service;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Market {

    /**
     * main class of the market
     */
    private List<User> users;
    private List<Product> products;

    /**
     * For market class, we will use Singleton design pattern.
     * Singleton is used when you want to have only one instance of a class in your entire program
     * In this exercise, all objects should use the instance of Market, so we need only one instance of
     * Market in our entire program. Hence , we make it Singleton.
     */
    private static Market market;

    public static Market getInstance() {
        if (market == null)
            market = new Market();
        return market;
    }

    private Market() {
        users = new ArrayList<User>();
        products = new ArrayList<Product>();
    }


    public User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public Product getProduct(long id) {
        for (Product product : products) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    public Good getGood(long id) {
        for (Product product : products) {
            if (product instanceof Good && product.getId() == id)
                return ((Good) product);
        }
        return null;
    }

    public Service getService(long id) {
        for (Product product : products) {
            if (product instanceof Service && product.getId() == id)
                return ((Service) product);
        }
        return null;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addToCart(int userID, int productID) {
        User user = getUser(userID);
        Product product = getProduct(productID);
        user.getCart().add(product);
    }

    public void purchaseProduct(User buyer, Product product) {
        buyer.setCredit(buyer.getCredit() - product.getPrice());
        product.getUser().setCredit(product.getUser().getCredit() + product.getPrice());
        product.setUser(buyer);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Product> getProducts() {
        return products;
    }
}
