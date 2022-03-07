package items;

import market.Market;
import users.User;

public class Good extends Product {

    /**
     * A subclass of product, should have four subclasses: property, car, educationalMaterial and digitalDevice
     */

    protected int guaranteeTime;
    protected boolean isAvailable;

    public Good(String name, long userID) {
        super(name, Market.getInstance().getUser(userID));
        this.market.addProduct(this);
    }

    public int getGuaranteeTime() {
        return guaranteeTime;
    }

    public void setGuaranteeTime(int guaranteeTime) {
        this.guaranteeTime = guaranteeTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
