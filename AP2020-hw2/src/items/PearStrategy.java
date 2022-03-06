package items;

public class PearStrategy extends BatteryPriceStrategy{
    @Override
    public double calculatePrice(Battery battery) {
        return 1000 * 1000 / battery.getChargeTime() + 150 * battery.getCapacity();
    }
}
