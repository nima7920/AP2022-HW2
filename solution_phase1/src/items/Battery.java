package items;

public class Battery {
    private double capacity;
    private double chargingSpeed;
    private int lifeSpan;
    private BatteryPriceStrategy strategy;

    public Battery(double capacity, double chargingSpeed, int lifeSpan, BatteryPriceStrategy strategy) {
        this.capacity = capacity;
        this.chargingSpeed = chargingSpeed;
        this.lifeSpan = lifeSpan;
        this.strategy = strategy;
    }


    public double getCapacity() {
        return capacity;
    }

    public double getChargingSpeed() {
        return chargingSpeed;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }


    public void setStrategy(BatteryPriceStrategy strategy) {
        this.strategy = strategy;
    }
    public double getPrice(){
        return this.strategy.calculatePrice(this);
    }
    public double getChargingTime(){
        return capacity / chargingSpeed;
    }
}

