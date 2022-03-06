package items;

import users.User;

public class Banking extends Service{

    private AccountType type;
    private float ratio;

    public Banking(String name, User user) {
        super(name, user);
    }


    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }
}
