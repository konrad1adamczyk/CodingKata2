import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
public class testAccount {
    Account account;
    @Before
    public void initAccoutn(){account = new Account();}

    @Test
    public void testDepositPositiveAmount(){
        Integer amount = 500;
        account.deposit(amount);
        assertTrue(amount.equals(account.checkBalance()));
    }
    @Test
    public void testDepositNegativeAmount(){
        Integer negativeAmount = -500;
        Integer balanceAfterNegativeDeposit =0;
        account.deposit(negativeAmount);
        assertTrue(balanceAfterNegativeDeposit.equals(account.checkBalance()));
    }

    @Test
    public void testWithdrawPositiveAmount(){
        Integer amount = 500;
        Integer balanceAfterWithdraw = 0;
        account.deposit(amount);
        account.withdraw(amount);
        assertTrue(balanceAfterWithdraw.equals(account.checkBalance()));
    }

    @Test
    public void testWithdrawMoreThenHave(){
        Integer amount = 500;
        Integer balanceAfterWithdraw = 0;
        account.deposit(amount);
        account.withdraw(amount);
        account.withdraw(amount);
        assertTrue(balanceAfterWithdraw.equals(account.checkBalance()));
    }

    @Test
    public void testStatement(){
        Integer amount = 450;
        account.deposit(amount);

        assertTrue(account.checkBalance());

    }


}
