package market;

import items.*;
import org.junit.Before;
import org.junit.Test;
import users.User;

import static org.junit.Assert.*;

public class MarketTest {

    private Market market = Market.getInstance();
    private User nimaA,lachin,iman,kasra,nimaK;
    private Product car1,car2,banking1,banking2;
    @Before
    public void initializeMarket() {
        // initializing users
        nimaA = new User("Nima.a", 9308747682L);
        lachin = new User("Lachin", 9395832008L);
        iman=new User("Iman",9);
        kasra = new User("Kasra", 10);
        nimaK = new User("Nima.k", 11);

        // initializing products
        car1=new Car("BMW",nimaA,2000,0,1395,false);
        banking1=new Banking("Melli",lachin);
        car2=new Car("Chevrolet",iman,3000,50,1390,true);
        banking2=new Banking("Maskan",kasra);
    }

    @Test
    public void addProductTest(){
        assertEquals(4,market.getProducts().size());
    }

    @Test
    public void addUserTest(){
        market.addUser(nimaA);
        market.addUser(lachin);
        market.addUser(iman);
        market.addUser(kasra);
        market.addUser(nimaK);
        assertEquals(5,market.getUsers().size());
    }

    @Test
    public void getUserTest(){
        User user1=market.getUser(lachin.getId());
        assertEquals("Lachin",user1.getName());
        assertEquals(9395832008L,user1.getPhoneNumber());

        User user2=market.getUser(kasra.getId());
        assertEquals("Kasra",user2.getName());
        assertEquals(10,user2.getPhoneNumber());

    }

    @Test
    public void getProductTest(){
        Product product1=market.getProduct(car2.getId());
        Product product2=market.getProduct(banking1.getId());

        assertEquals("Chevrolet",product1.getName());
        assertEquals("Iman",product1.getUser().getName());
        assertEquals("Melli",product2.getName());
        assertEquals("Lachin",product2.getUser().getName());

    }

    @Test
    public void getGoodTest(){
        Good good1=market.getGood(car1.getId());
        Good good2=market.getGood(car2.getId());

        assertEquals("BMW",good1.getName());
        assertEquals("Nima.a",good1.getUser().getName());
        assertEquals("Chevrolet",good2.getName());
        assertEquals("Iman",good2.getUser().getName());

    }

    @Test
    public void getServiceTest(){
        Service service1=market.getService(banking1.getId());
        Service service2=market.getService(banking2.getId());

        assertEquals("Melli",service1.getName());
        assertEquals("Lachin",service1.getUser().getName());
        assertEquals("Maskan",service2.getName());
        assertEquals("Kasra",service2.getUser().getName());
    }


}