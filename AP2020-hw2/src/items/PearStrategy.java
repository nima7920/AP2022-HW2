package items;

public class PearStrategy extends BatteryPriceStrategy{
    @Override
    public double calculatePrice(Battery battery) {
        return 1000 * 1000 / battery.getChargingTime() + 150 * battery.getCapacity();
    }
}
