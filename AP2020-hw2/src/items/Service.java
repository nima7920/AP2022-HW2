package items;

import users.User;

public class Service extends Product{
    /**
     * A subclass of product, should have two subclasses: guarantee and banking
     */
    protected int duration;

    public Service(String name, User user) {
        super(name, user);
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
