import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.BankAccount;
public class BankAccountTest {

    @Test
    public void testDepositPositiveAmount() {

        BankAccount account = new BankAccount(100.0, 0.05);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDepositNegativeAmount() {

        BankAccount account = new BankAccount(100.0, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0));
    }

    @Test
    public void testWithdrawPositiveAmount() {

        BankAccount account = new BankAccount(100.0, 0.05);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawNegativeAmount() {

        BankAccount account = new BankAccount(100.0, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50.0));
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount(100.0, 0.05);
        assertThrows(IllegalStateException.class, () -> account.withdraw(150.0));
    }

    @Test
    public void testTransfer() {
        BankAccount account1 = new BankAccount(100.0, 0.05);
        BankAccount account2 = new BankAccount(50.0, 0.05);
        account1.transfer(30.0, account2);
        assertEquals(70.0, account1.getBalance(), 0.001);
        assertEquals(80.0, account2.getBalance(), 0.001);
    }

    @Test
    public void testTransferWithNullAccount() {

        BankAccount account1 = new BankAccount(100.0, 0.05);
        assertThrows(NullPointerException.class, () -> account1.transfer(30.0, null));
    }

    @Test
    public void testAddInterest() {
        BankAccount account = new BankAccount(100.0, 0.05);
        account.addInterest();
        assertEquals(105.0, account.getBalance(), 0.001);
    }


}
