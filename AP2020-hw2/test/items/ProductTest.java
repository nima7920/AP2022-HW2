package items;

import market.Market;
import org.junit.Test;
import users.User;

import static org.junit.Assert.*;

public class ProductTest {
    private User user = new User("l", 3423543545L);
    private Product product = new Product("p", user);
    private Product product2 = new Product("p2", user);

    @Test
    public void testProductConstructor(){
        assertEquals("p", product.getName());
        assertEquals(user, product.getUser());
        assertEquals("l", product.getUser().getName());
        assertNotNull(Market.getInstance().getProduct(product.getId()));

        // check id:
        assertEquals(1, product2.getId()-product.getId());
        assertTrue(product.getId() > 999999);
    }

}