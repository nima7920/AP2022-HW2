package market;

import items.Good;
import items.Product;
import items.Service;
import users.Member;
import users.User;

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

    public static Market getInstance(){
        if(market==null)
            market=new Market();
        return market;
    }

    private Market(){

    }

    public Member getMember(long phone){

        for(User member:users){

        }
        return null;
    }

    public User getUser(long id){

        return null;
    }

    public Product getProduct(long id){

        return null;
    }

    public Good getGood(long id){

        return null;
    }

    public Service getService(long id){

        return null;
    }

}
