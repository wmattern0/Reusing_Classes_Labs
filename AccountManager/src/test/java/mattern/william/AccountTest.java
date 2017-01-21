package mattern.william;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/20/17.
 */
public class AccountTest {

    @Test
    public void getBalance() {
        Account a1000001 = new Account(100);
        double expected = 100, actual = a1000001.getBalance();
        assertEquals(actual, expected, 0.0);
    }

    @Test
    public void debitAccountTest(){
        Account a1000002 = new Account(0);
        a1000002.debitAccount(100);
        double expected =100, actual = a1000002.getBalance();
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void creditAccountTest(){
        Account a100003 = new Account(0);
        a100003.creditAccount(50);
        double expected = -50, actual = a100003.getBalance();
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void creditAccountPositiveTest(){
        Account a1000004 = new Account(100);
        a1000004.creditAccount(-5000);
        double expected = 100, actual = a1000004.getBalance();
        assertEquals(expected,actual,0.0);
    }
}