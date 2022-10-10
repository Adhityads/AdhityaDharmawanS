package ujiandua;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class TestAccount {

    Account account;

    @BeforeClass
    @Test(priority = 1)
    @Parameters({"acc_no", "name", "amount"})
    public void testinsert(int acc_no, String name, double amount){
        account = new Account();
        account.insert(acc_no, name, amount);
        Assert.assertEquals(acc_no, 123);
        Assert.assertEquals(name, "Adhitya");
        Assert.assertEquals(amount, 2000);

    }

    @Test(priority = 2)
    public void testdeposit() {
        account.deposit(1000);
        double actual = account.amount;
        Assert.assertEquals(actual, 3000);
    }

    @Test(priority = 3)
    public void withdraw(){
        account.withdraw(500);
        double actual = account.amount;
        Assert.assertEquals(actual, 2500);
    }

    @Test(priority = 4)
    public void checkBalance() {
        account.checkBalance();
        Assert.assertEquals(account.amount, 2500);
    }
    @Test(priority = 5)
    public void dislpay(){
        account.display();
        Assert.assertEquals(account.acc_no, 123);
        Assert.assertEquals(account.name, "Adhitya");
        Assert.assertEquals(account.amount, 2500);
    }
}

