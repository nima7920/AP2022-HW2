package items;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import users.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
// one test
public class ServiceTest {
    @Rule
    public Timeout time = new Timeout(2000);
    @Test
    public void serviceTest() {
        Service service=new Service("cleaning",new User("cleaner",9911));
        service.setDuration(100);
        List list = new ArrayList();
        list.add(service);
        assertTrue(list.get(0) instanceof Product);
        assertEquals(100,service.getDuration());
        assertEquals("cleaning",service.getName());
        assertEquals("cleaner",service.getUser().getName());
    }
}