package users;

import items.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private static User user;
    private static User user2;

    @BeforeClass
    public static void addProducts(){
        user = new User("smith", 555555L);
        user2 = new User("user2", 34563245L);
        new Car("BMW",user,3200,0,1397,false);
        new Car("Car2",user,4300,0,1398,false);
    }

    @Test
    public void testUserConstructor() {
        assertEquals("smith", user.getName());
        assertEquals(555555, user.getPhoneNumber());
        // check id:
        assertEquals(1, user2.getId()-user.getId());
        assertTrue(user.getId() > 999999);
    }

    @Test
    public void usersCart() {
        assertNotNull(user.getCart());
    }

    @Test
    public void testUserTotalPriceMethod(){
        checkDouble(calculateUserTotalPrice(user), user.getTotalPrice());
    }

    private double calculateUserTotalPrice(User user) {
        double res = 0;
        for (Product product : user.getCart()) {
             res += product.getPrice();
        }
        return res;
    }

    private void checkDouble(double expected, double actual){
        assertEquals(expected, actual, expected * 1e-6);
    }


    @Test
    public void testPurchaseMethodInUserClass(){
        user.purchase();
        assertEquals(0, user.getCart().size());
    }





}