package users;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private User user = new User("smith", 555555);
    @Test
    public void testNameAndPhone() {
        assertEquals("smith", user.getName());
        assertEquals(555555, user.getPhone());
    }
}