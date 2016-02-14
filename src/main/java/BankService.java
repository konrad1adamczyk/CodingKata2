/**
 * Created by konrad on 13.02.16.
 */
public class BankService {
    public static void transfer(Integer amount, Account accountToTransfer, Account accontToWithdraw){
        accontToWithdraw.withdraw(amount);
        accountToTransfer.deposit(amount);
    }
}
