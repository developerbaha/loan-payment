package uk.keele.assigment.accounts;

/**
 * Kredi Hesabı
 */
public class LoanAccount {

    private float balance;
    private final float interestRate = (float) 0.008;
    private float interest = 0;

    public LoanAccount() {
    }

    public LoanAccount(float balance) {
        this.balance = balance;
    }

    /**
     * This method should take no arguments and return the balance. It is required because balance
     * will not be accessible directly.
     *
     * @return this float is in pounds
     */
    public float getBalance() {
        return balance;
    }

    /**
     * This method should take the amount to be deposited to the account as an argument and add
     * that to the balance.
     */
    public void addInterest() {
        interest += interestRate * balance;
    }

    /**
     * This method should take the amount to be deposited to the account as an argument and add
     * that to the balance
     *
     * @param amount an argument and add that to the balance.
     */
    public void makePayment(float amount) {
        balance -= amount;
    }


}
