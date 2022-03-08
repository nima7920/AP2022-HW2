package items;

import market.Market;
import users.User;

public class Product {
    protected String name;
    protected User user;
    protected int id;
    protected Market market=Market.getInstance();
    protected static int marketCount = 1000 * 1000;
    public Product(String name,User user) {
        market.addProduct(this);
        this.name = name;
        this.user=user;
        this.id = marketCount++;
    }

    public double getPrice(){
        return 0;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }


}
