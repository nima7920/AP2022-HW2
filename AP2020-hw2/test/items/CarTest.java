package items;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import users.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarTest {

    private static User user;
    private static Car car, car2, car3;
    @Rule
    public Timeout time = new Timeout(2000);

    @BeforeClass
    public static void addProducts(){
        user = new User("emma", 3423524L);
        car = new Car("carnamee", user, 2030, 7, 1394, true);
        car2 = new Car("carr", user, 2034.6, 71, 1398, true);
        car3 = new Car("carr33", user, 1034.6, 1, 1398, false);
    }

    @Test
    public void testCarConstructor(){
        List list = new ArrayList();
        list.add(car);
        assertTrue(list.get(0) instanceof Good);
        assertEquals("emma", car.getUser().getName());
        assertEquals("carnamee", car.getName());
        assertEquals(user, car.getUser());
        checkDouble(2030, car.getFactoryPrice());
        checkDouble(7, car.getDistanceTraveled());
        assertEquals(1394, car.getManufacturingYear());
        assertTrue(car.isHadAccident());
    }

    @Test
    public void testCarSettersAndGetters() {
        Car thisCar = new Car("carnamee", user, 2030, 7, 1394, true);
        thisCar.setHadAccident(false);
        thisCar.setDistanceTraveled(2022);
        assertEquals(false, thisCar.isHadAccident());
        assertEquals(2022, thisCar.getDistanceTraveled(), 2022*1e-6);

    }

    private void checkDouble(double expected, double actual){
        assertEquals(expected, actual, expected * 1e-6);
    }

    @Test
    public void testGetCarPrice(){
        checkDouble(getPrice(car), car.getPrice());
        checkDouble(getPrice(car2), car2.getPrice());
        checkDouble(getPrice(car3), car3.getPrice());
    }

    public double getPrice(Car car) {
        int flag = 0;
        if (car.isHadAccident()) flag = 1;
        return (car.getFactoryPrice() / (car.getDistanceTraveled() / Math.pow(10, 4))) * (flag * 0.3 + (1 - flag)) - (1400 - car.getManufacturingYear());
    }

}