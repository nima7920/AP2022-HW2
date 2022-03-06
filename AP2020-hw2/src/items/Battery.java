package items;

public class Battery {
    private double capacity;
    private double chargeSpeed;
    private int lifeTime;
    private BatteryPriceStrategy strategy;

    public Battery(double capacity, double chargeSpeed, int lifeTime, BatteryPriceStrategy strategy) {
        this.capacity = capacity;
        this.chargeSpeed = chargeSpeed;
        this.lifeTime = lifeTime;
        this.strategy = strategy;
    }


    public double getCapacity() {
        return capacity;
    }

    public double getChargeSpeed() {
        return chargeSpeed;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setChargeSpeed(double chargeSpeed) {
        this.chargeSpeed = chargeSpeed;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public void setStrategy(BatteryPriceStrategy strategy) {
        this.strategy = strategy;
    }
    public double getPrice(){
        return this.strategy.calculatePrice(this);
    }
    public double getChargeTime(){
        return capacity / chargeSpeed;
    }
}
