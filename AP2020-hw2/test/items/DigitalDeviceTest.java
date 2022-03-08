package items;

import org.junit.Test;
import users.User;

import static org.junit.Assert.*;
// 4 tests
public class DigitalDeviceTest {
    private User user = new User("Mr.Smith", 1234);
    private Battery battery = new Battery(1000, 12, 3, new BatteryPriceStrategy());
    private Battery newBattery = new Battery(1100, 12, 3, new BatteryPriceStrategy());
    private Display display= new Display(10, 3, 4);
    private Display newDisplay= new Display(11, 3, 4);
    private DigitalDevice laptop = new DigitalDevice("laptop", user, 10, battery, display, DigitalDeviceType.laptop);
    private DigitalDevice smartWatch = new DigitalDevice("smartWatch", user, 10, battery, display, DigitalDeviceType.smartWatch);
    private DigitalDevice phone = new DigitalDevice("phone", user, 10, battery, display, DigitalDeviceType.phone);
    @Test
    public void testDigitalDeviceConstructor() {
        assertTrue(laptop instanceof Good);
        assertEquals("laptop", laptop.getName());
        assertEquals(user, laptop.getUser());
        assertEquals(battery, laptop.getBattery());
        assertEquals(display, laptop.getDisplay());
        assertEquals(DigitalDeviceType.laptop, laptop.getType());

    }

    @Test
    public void testDigitalDeviceGetPrice() {
        assertEquals(calculateDevicesTruePrice(laptop),laptop.getPrice(), calculateDevicesTruePrice(laptop) * 1e-6);
        assertEquals(calculateDevicesTruePrice(smartWatch),smartWatch.getPrice(), calculateDevicesTruePrice(smartWatch) * 1e-6);
        assertEquals(calculateDevicesTruePrice(phone),phone.getPrice(), calculateDevicesTruePrice(phone) * 1e-6);

    }
    private double calculateDevicesTruePrice(DigitalDevice device){
        double res = .1 * device.getMemory() * device.getMemory();
        switch (device.getType()){
            case phone:
                res += 10 * 1000 * 1000;
                break;
            case laptop:
                res += 30 * 1000 * 1000;
                break;
            case smartWatch:
                res += 3 * 1000 * 1000;
                break;
        }
        res += battery.getPrice();
        res += display.getPrice();
        res += 1000 * 1000 * device.getBatteryLife();
        return res;
    }

    @Test
    public void testDeviceBatteryLife() {
        assertEquals(battery.getCapacity() / (display.getResolution() * .0001), laptop.getBatteryLife(),
                battery.getCapacity() / (display.getResolution() * .0001) * 1e-6);
    }

    @Test
    public void testDigitalDeviceSetters() {
        laptop.setMemory(-1);
        assertEquals(-1, laptop.getMemory());
        laptop.setBattery(newBattery);
        assertEquals(newBattery, laptop.getBattery());
        laptop.setDisplay(newDisplay);
        assertEquals(newDisplay, laptop.getDisplay());

    }
}