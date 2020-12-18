package uk.keele.assigment.accounts;


public class LoanAccount {

    private float balance;
    private final float interestRate = (float) 0.008;
    private float interest = 0;

    public LoanAccount() {
    }

    public LoanAccount(float balance) {
        this.balance = balance;
    }


    public float getBalance() {
        return balance;
    }

    public void addInterest() {
        interest += interestRate * balance;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public void makePayment(float amount) {
        if (balance > 0) {
            balance -= amount;
        }
        if (balance == 0) {
            interest -= Math.min(interest, amount);
        }
    }


}
