package items;

import users.User;

public class Banking extends Service {

    private AccountType type;
    private double ratio;
    private double accountPrice;

//    public Banking(String name, User user) {
//        super(name, user);
//    }
    public Banking(String name,User user, AccountType type,double ratio){
        super(name, user);
        this.type = type;
        this.ratio = ratio;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }

    @Override
    public double getPrice() {
        return accountPrice;
    }

    public void setAccountPrice(double accountPrice) {
        this.accountPrice = accountPrice;
    }

    public void applyProfit() {
        switch (type) {
            case current: {
                double newCredit = this.user.getCredit() + Math.pow(this.user.getTotalPrice(), Math.pow(1.02, this.user.getCart().size()));
                this.user.setCredit(newCredit);
                break;
            }
            case saving: {
                this.user.setCredit(this.user.getCredit() + (accountPrice * 0.02 * duration));
                break;
            }
            case deposit: {
                double newCredit = this.user.getCredit() + (Math.sqrt(this.user.getCredit()) / accountPrice)+this.duration;
                this.user.setCredit(newCredit);
                break;
            }
        }
    }
}
