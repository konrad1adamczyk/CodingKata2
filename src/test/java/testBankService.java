import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by konrad on 13.02.16.
 */
public class testBankService {
    Account accountToTransfer;
    Account accountToWithdraw;

    @Before
    public void initAccount(){
        accountToTransfer = new Account();
        accountToWithdraw = new Account();
    }

    @Test
    public void testTransfer(){
        Integer amount = 500;
        Integer balanceAfterTransfer = 0;
        accountToWithdraw.deposit(500);
        BankService.transfer(amount,accountToTransfer, accountToWithdraw);
        assertTrue(balanceAfterTransfer.equals(accountToWithdraw.checkBalance()));
        assertTrue(amount.equals(accountToTransfer.checkBalance()));
    }





}
