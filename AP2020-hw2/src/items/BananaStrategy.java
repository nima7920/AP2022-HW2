package items;

public class BananaStrategy extends BatteryPriceStrategy{
    @Override
    public double calculatePrice(Battery battery) {
        return 300 * battery.getCapacity() + 10 * 1000 * battery.getLifeTime();
    }
}
