package market;

import items.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import users.User;

import static org.junit.Assert.*;

public class MarketTest {

    private static Market market = Market.getInstance();
    private static User nimaA, lachin, iman, kasra, nimaK;
    private static Product car1, car2, banking1, banking2;

    @BeforeClass
    public static void initializeMarket() {
        // initializing users
        nimaA = new User("Nima.a", 9308747682L);
        nimaA.setCredit(1000);
        lachin = new User("Lachin", 9395832008L);
        lachin.setCredit(5000);
        iman = new User("Iman", 9);
        iman.setCredit(7000);
        kasra = new User("Kasra", 10);
        kasra.setCredit(2000);
        nimaK = new User("Nima.k", 11);
        nimaK.setCredit(4000);

        market.addUser(nimaA);
        market.addUser(lachin);
        market.addUser(iman);
        market.addUser(kasra);
        market.addUser(nimaK);

        // initializing products
        car1 = new Car("BMW", nimaA, 2000, 0, 1395, false);
        ((Car) car1).setPrice(1000);
        banking1 = new Banking("Melli", lachin);
        ((Banking) banking1).setAccountPrice(500);
        car2 = new Car("Chevrolet", iman, 3000, 50, 1390, true);
        ((Car) car2).setPrice(1500);
        banking2 = new Banking("Maskan", kasra);
        ((Banking) banking2).setAccountPrice(100);
    }

// 5 tests

    @Test
    @Ignore
    public void addProductTest() {
        assertEquals(4, market.getProducts().size());
    }

    @Test
    public void addUserTest() {
        assertEquals(5, market.getUsers().size());
//        System.out.println(market.getUsers().get(0).getName());
//        System.out.println(market.getUsers().get(1).getName());
//        System.out.println(market.getUsers().get(2).getName());
//        System.out.println(market.getUsers().get(3).getName());
//        System.out.println(market.getUsers().get(5).getName());

        User user1 = market.getUser(lachin.getId());
        assertEquals("Lachin", user1.getName());
        assertEquals(9395832008L, user1.getPhoneNumber());

        User user2 = market.getUser(kasra.getId());
        assertEquals("Kasra", user2.getName());
        assertEquals(10, user2.getPhoneNumber());
    }


    @Test
    public void getProductTest() {
        Product product1 = market.getProduct(car2.getId());
        Product product2 = market.getProduct(banking1.getId());

        assertEquals("Chevrolet", product1.getName());
        assertEquals("Iman", product1.getUser().getName());
        assertEquals("Melli", product2.getName());
        assertEquals("Lachin", product2.getUser().getName());

    }

    @Test
    public void getGoodTest() {
        Good good1 = market.getGood(car1.getId());
        Good good2 = market.getGood(car2.getId());

        assertEquals("BMW", good1.getName());
        assertEquals("Nima.a", good1.getUser().getName());
        assertEquals("Chevrolet", good2.getName());
        assertEquals("Iman", good2.getUser().getName());

    }

    @Test
    public void getServiceTest() {
        Service service1 = market.getService(banking1.getId());
        Service service2 = market.getService(banking2.getId());

        assertEquals("Melli", service1.getName());
        assertEquals("Lachin", service1.getUser().getName());
        assertEquals("Maskan", service2.getName());
        assertEquals("Kasra", service2.getUser().getName());
    }

    @Test
    public void purchaseTest() {
        double p1 = car1.getPrice();
        market.addToCart(iman.getId(), car1.getId());
        market.addToCart(iman.getId(), banking1.getId());
        assertEquals(2, iman.getCart().size());
        market.purchaseProduct(iman, car1);
        market.purchaseProduct(iman, banking1);
        assertEquals(7000 - p1 - 500, iman.getCredit(), (7000 - p1 - 500) * 1e-6);
        assertEquals("Iman", car1.getUser().getName());
        assertEquals(1000 + p1, nimaA.getCredit(), (100 + p1) * 1e-6);
        assertEquals(5500, lachin.getCredit(), 5500 * 1e-6);
        market.purchaseProduct(nimaA, car1);
        market.purchaseProduct(lachin, banking1);
    }
}