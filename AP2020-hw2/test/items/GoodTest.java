package items;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import users.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GoodTest {
    @Rule
    public Timeout time = new Timeout(2000);
    @Test
    public void goodTest() {
        Good good=new Good("banana",new User("Nima",99));
        List list = new ArrayList();
        list.add(good);
        assertTrue(list.get(0) instanceof Product);
        assertEquals("banana",good.getName());
        assertEquals("Nima",good.getUser().getName());
    }

}