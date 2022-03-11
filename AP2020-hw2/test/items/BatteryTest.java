package items;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

// 3 tests
public class BatteryTest {
    @Rule
    public Timeout time = new Timeout(2000);

    private BatteryPriceStrategy strategy = new BatteryPriceStrategy(){
        @Override
        public double calculatePrice(Battery battery){
            return battery.getCapacity() / battery.getLifeSpan();
        }

    };
    private BatteryPriceStrategy newStrategy = new BatteryPriceStrategy(){
        @Override
        public double calculatePrice(Battery battery){
            return battery.getChargingSpeed();
        }
    };
    private final Battery battery = new Battery(2000, 200, 3, strategy);



    @Test
    public void testBatteryConstructor() {
        assertEquals(2000, battery.getCapacity(), 2000 * 1e-6);
        assertEquals(200, battery.getChargingSpeed(), 200 * 1e-6);
        assertEquals(3, battery.getLifeSpan(), 3 * 1e-6);
        assertEquals(strategy, battery.getStrategy());
    }

    @Test
    public void testBatteryPrice(){
        double expectedPrice = strategy.calculatePrice(battery);
        assertEquals(expectedPrice,battery.getPrice(), expectedPrice * 1e-6);
    }

    @Test
    public void testBatterySetters() {
        battery.setStrategy(newStrategy);
        double expectedPrice = newStrategy.calculatePrice(battery);
        assertEquals(newStrategy, battery.getStrategy());
    }

    @Test
    public void testBatteryChargingTime() {
        assertEquals(battery.getCapacity() / battery.getChargingSpeed(),
                battery.getChargingTime(),
                battery.getCapacity() / battery.getChargingSpeed() * 1e-6);
    }
}