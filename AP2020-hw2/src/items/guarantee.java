package items;

public class guarantee extends Service{
    private GuaranteeType type;
    private int duration;
    private Good good;
    private long goodID, userID;

    public guarantee(GuaranteeType type, int duration, Good good, long goodID, long userID) {
        this.type = type;
        this.duration = duration;
        this.good = good;
        this.goodID = goodID;
        this.userID = userID;
    }

    public GuaranteeType getType() {
        return type;
    }

    public void setType(GuaranteeType type) {
        this.type = type;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
