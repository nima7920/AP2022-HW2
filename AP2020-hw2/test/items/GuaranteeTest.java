package items;

import market.Market;
import org.junit.Test;
import users.User;

import static org.junit.Assert.*;

public class GuaranteeTest {

    private User user = new User("llll", 3423423L);
    private Good good = new Good("gooood", user);
    private Guarantee guarantee = new Guarantee("g", good, user);

    @Test
    public void testGuaranteeConstructor(){
        assertEquals("p", guarantee.getName());
        assertEquals(user, guarantee.getUser());
        assertEquals("gooood", guarantee.getGood().getName());
        assertEquals("llll", guarantee.getUser().getName());
        assertTrue(guarantee instanceof Service);
    }



}