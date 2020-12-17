package uk.keele.assigment.root;

/**
 * Account common attributes
 * araba: taksi, hacback, manuel bir arabada basei
 */
public abstract class Account {


    /**
     * The balance of each account in pounds. This should be a floating point number in order to
     * accommodate pence amounts. This attribute should be private to the class.
     */
    private float balance;

    /**
     * The monthly interest rate of each account. This should be a class variable (i.e. not an
     * instance variable) and also private to the class. In other words, any change to this
     * attribute should reflect on all the instances of the class it belongs to. This attribute should be
     * initialised for each class as follows:
     * The interestRate for SavingsAccount should be initialised to 0.003 (i.e. 0.3%).
     * The interestRate for CurrentAccount should be initialised to 0.0007 (i.e. 0.07%).
     * The interestRate for LoanAccount should be initialised to 0.008 (i.e. 0.8%).
     */
    private float interestRate;


    /**
     * This method should take no arguments and return the balance. It is required because balance
     * will not be accessible directly.
     * @return this float is in pounds
     */
   public float getBalance(){
       return balance;
   }


    /**
     * This method should take the amount to be deposited to the account as an argument and add
     * that to the balance.
     *
     * @param amount This is deposited which will be addded in the balance
     */
   public void addInterest(float amount){
   }





}
