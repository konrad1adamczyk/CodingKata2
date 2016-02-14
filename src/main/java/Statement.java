import java.util.Date;

/**
 * Created by konrad on 13.02.16.
 */
public class Statement {

    private Integer statementBalance;
    private Integer statementAmount;
    private Date statementDate;


    public Statement(Date date, Integer balance, Integer amount){
        statementBalance = balance;
        statementAmount = amount;
        statementDate = date;
    }

    public Integer checkStatementBalance(){
        return statementBalance;
    }

    public Integer checkStatementAmount(){
        return statementAmount;
    }

    public Date checkStatementDate(){
        return statementDate;
    }
}
