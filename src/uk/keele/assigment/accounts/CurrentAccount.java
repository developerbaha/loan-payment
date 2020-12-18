package uk.keele.assigment.accounts;

import uk.keele.assigment.root.Account;
import uk.keele.assigment.root.AccountBehaviour;

public class CurrentAccount {


    private float balance;
    private float interestRate = (float) 0.0007;
    private float interest = 0;

    public CurrentAccount(float balance) {
        this.balance = balance;
    }

    public CurrentAccount() {
    }

    public float getBalance() {
        return balance;
    }

    public float interes() {
        return interest;

    }

    public void addInterest() {
        interest += interestRate * balance;
        balance = balance + interest;
    }

    public void makeDeposit(float amount) {
        balance += amount;
    }


}
