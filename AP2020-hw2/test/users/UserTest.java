package users;

import items.Banking;
import items.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private User user = new User("smith", 555555);
    @Test
    public void usersNameAndPhone() {
        assertEquals("smith", user.getName());
        assertEquals(555555, user.getPhoneNumber());

    }

    @Test
    public void usersCart() {
        assertNotNull(user.getCart());
    }



}