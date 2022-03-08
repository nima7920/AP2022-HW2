package items;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import users.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GuaranteeTest {

    private User user = new User("llll", 3423423L);
    private Good good = new Good("gooood", user);
    private Guarantee guarantee = new Guarantee("g", good, user);
    @Rule
    public Timeout time = new Timeout(2000);

    @Test
    public void testGuaranteeConstructor(){
        List list = new ArrayList();
        list.add(guarantee);
        assertTrue(list.get(0) instanceof Service);
        assertEquals("g", guarantee.getName());
        assertEquals(user, guarantee.getUser());
        assertEquals("gooood", guarantee.getGood().getName());
        assertEquals("llll", guarantee.getUser().getName());

    }

    @Test
    public void testGetPriceInGuarantee(){
        guarantee.setDuration(101);
        checkDouble(calcPrice(guarantee), guarantee.getPrice());
    }

    private double  calcPrice(Guarantee guarantee) {
        return guarantee.getGood().getPrice() * guarantee.getDuration() * Math.pow(10, -3);
    }

    private void checkDouble(double expected, double actual){
        assertEquals(expected, actual, expected * 1e-6);
    }



}