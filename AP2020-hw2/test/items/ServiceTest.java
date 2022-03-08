package items;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import users.User;

import static org.junit.Assert.*;
// one test
public class ServiceTest {

    @Test
    public void serviceTest() {
        Service service=new Service("cleaning",new User("cleaner",9911));
        service.setDuration(100);
        assertTrue(service instanceof Product);
        assertEquals(100,service.getDuration());
        assertEquals("cleaning",service.getName());
        assertEquals("cleaner",service.getUser().getName());
    }
}