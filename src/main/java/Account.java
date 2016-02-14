import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by konrad on 13.02.16.
 */
public class Account {

    private Integer balance = 0;
    private Statement statement = null;

    public Integer checkBalance(){
        return balance;
    }

    public Statement deposit(Integer amount){
        if (amount>=0){
            balance+=amount;
            Date depositDate = new Date();
            statement = new Statement(depositDate,balance,amount);
            return statement;
        }
        else {
            return null;
        }
    }

    public void withdraw(Integer amount){
        if (balance>=amount){
            if(amount>=0){
                balance-=amount;
            }
        }
    }






}
