package items;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import users.User;

import static org.junit.Assert.*;

public class GoodTest {
    @Rule
    public Timeout time = new Timeout(2000);
    @Test
    public void goodTest() {
        Good good=new Good("banana",new User("Nima",99));
        assertTrue(good instanceof Product);
        assertEquals("banana",good.getName());
        assertEquals("Nima",good.getUser().getName());
    }

}