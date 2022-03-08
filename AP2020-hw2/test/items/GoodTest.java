package items;

import org.junit.Test;
import users.User;

import static org.junit.Assert.*;

public class GoodTest {

    @Test
    public void goodTest() {
        Good good=new Good("banana",new User("Nima",99));
        assertTrue(good instanceof Product);
        assertEquals("banana",good.getName());
        assertEquals("Nima",good.getUser().getName());
    }

}