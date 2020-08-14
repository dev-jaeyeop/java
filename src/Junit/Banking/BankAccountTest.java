package Junit.Banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.0, balance);
    }

    @Test
    void withdraw() {
        fail("This test has yet to be implemented");
    }

    @Test
    void getBalance() {
        fail("This test has yet to be implemented");
    }

    @Test
    public void dummyTest() {
        assertEquals(20, 20);
    }

}