package items;

import market.Market;
import users.User;


public class Guarantee extends Service{
    private Good good;

    public Guarantee(String name, Good good, User user) {
        super(name, user);
        this.good = good;
    }


    @Override
    public double getPrice() {
        return this.good.getPrice() * this.duration * Math.pow(10, -3);
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }



}
