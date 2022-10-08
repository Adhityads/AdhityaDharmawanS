package ujiandua;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import ujiandua.testng.Account;


public class TestAccount {

    Account account;

    @BeforeClass
    public void insert(){
        account = new Account();
        account.insert(123, "Adhitya", 2000);

    }

    @Test(priority = 1)
    public void deposit() {
        account.deposit(1000);
        double actual = account.amount;
        Assert.assertEquals(actual, 3000);
    }

    @Test(priority = 2)
    public void withdraw(){
        account.withdraw(500);
        double actual = account.amount;
        Assert.assertEquals(actual, 2500);
    }

    @Test(priority = 3)
    @Parameters("user")
    public void checkBalance(String user) {
        account.checkBalance();
        Assert.assertEquals(account.amount, 2500);
    }
    @Test(priority = 4)
    @Parameters("user")
    public void dislpay(String user){
        account.display();
        Assert.assertEquals(account.acc_no, 123);
        Assert.assertEquals(account.name, "Adhitya");
        Assert.assertEquals(account.amount, 2500);
    }
}

