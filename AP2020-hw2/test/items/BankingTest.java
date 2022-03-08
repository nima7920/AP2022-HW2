package items;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import users.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
// 3 tests
public class BankingTest {

    private Banking banking;
    @Rule
    public Timeout time = new Timeout(2000);
    // tests for phase 1
    @Test
    public void bankingConstructorTest() {
        banking = new Banking("Maskan", new User("Nima", 1100));
        List list = new ArrayList();
        list.add(banking);
        assertTrue(list.get(0) instanceof Service);
        assertEquals("Maskan",banking.getName());
        assertEquals("Nima",banking.getUser().getName());
    }

    @Test
    public void bankingGetterSetterTest(){
        banking = new Banking("Maskan", new User("Nima", 1100));
        banking.setDuration(100);
        banking.setType(AccountType.current);
        banking.setRatio(1.2F);
        banking.setAccountPrice(100);
        assertEquals(100,banking.getDuration());
        assertEquals(AccountType.current,banking.getType());
    }

    // tests for phase 2
    @Test
    public void bankingApplyProfitTest(){
        User user=new User("Nima",1100);
        banking=new Banking("Maskan",user);
        banking.setAccountPrice(100);
        banking.setRatio(1.2F);

        // current
        user.setCredit(1000);
        user.getCart().add(banking);
        banking.setType(AccountType.current);
        banking.applyProfit();
        assertEquals(1109.64781961,user.getCredit(),1109.64781961*1e-6);

        // saving
        user.setCredit(1000);
        banking.setType(AccountType.saving);
        banking.applyProfit();
        assertEquals(1004,user.getCredit(),1004*1e-6);

        // deposit
        banking.setType(AccountType.deposit);
        banking.setDuration(100);
        banking.applyProfit();

        assertEquals(1104.31685959,user.getCredit(),1104.31685959*1e-6);
    }

}