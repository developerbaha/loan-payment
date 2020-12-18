package uk.keele.assigment.accounts;

import uk.keele.assigment.root.Account;
import uk.keele.assigment.root.AccountBehaviour;

public class SavingsAccount {

    public SavingsAccount(float balance) {
        this.balance = balance;
    }

    public SavingsAccount() {
    }

    private float balance;
    private final float interestRate = (float) 0.003;
    private float interest = 0;

    public float getBalance() {
        return balance;
    }

    public void addInterest() {
        interest += interestRate * balance;
        balance = balance + interest;

    }
    public float interes (){
        return interest;

    }
    public void makeDeposit(float amount) {
        balance += amount;
    }


}
