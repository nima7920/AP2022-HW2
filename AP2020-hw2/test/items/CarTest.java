package items;

import org.junit.BeforeClass;
import org.junit.Test;
import users.User;

import static org.junit.Assert.*;

public class CarTest {

    private static User user;
    private static Car car, car2, car3;


    @BeforeClass
    public static void addProducts(){
        user = new User("emma", 3423524L);
        car = new Car("carnamee", user, 2030, 7, 1394, true);
        car2 = new Car("carr", user, 2034.6, 71, 1398, true);
        car3 = new Car("carr33", user, 1034.6, 1, 1398, false);
    }

    @Test
    public void testCarConstructor(){
        assertEquals("emma", car.getUser().getName());
        assertEquals("carnamee", car.getName());
        assertEquals(user, car.getUser());
        checkDouble(2030, car.getFactoryPrice());
        checkDouble(7, car.getDistanceTraveled());
        assertEquals(1394, car.getManufacturingYear());
        assertTrue(car.isHadAccident());
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