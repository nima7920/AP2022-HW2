package items;

import market.Market;
import users.User;

public class Product {
    protected String name;
    protected User user;
    protected long id;
    protected Market market=Market.getInstance();

    public Product(String name,User user) {
        if(name.length()<1 || name.length()>80){
            System.out.println("Invalid Product name");
            return;
        }
        this.name = name;
        this.user=user;
        generateID();
    }

    private void generateID(){
        this.id=System.nanoTime();
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
