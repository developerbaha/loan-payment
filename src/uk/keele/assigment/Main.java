package uk.keele.assigment;

import uk.keele.assigment.accounts.CurrentAccount;
import uk.keele.assigment.accounts.LoanAccount;
import uk.keele.assigment.accounts.SavingsAccount;

public class Main {

    public static void main(String[] args) {


        CurrentAccount johnCurrent = new CurrentAccount(0);
        LoanAccount johnLoan = new LoanAccount(20000);

        LoanAccount maryLoanAccount = new LoanAccount(15000);
        SavingsAccount marySavingsAccount = new SavingsAccount(100);

        int sum = 0;

        // aylık ödemeler
        for (int i = 0; i < 300; i++) {

            //////////////////////////////////////////
            if (johnLoan.getBalance() + johnLoan.getInterest() > 0) {


                johnCurrent.makeDeposit(600);
                johnCurrent.addInterest();

                johnLoan.makePayment(200);
                johnLoan.addInterest();

                sum = i;
            }
        }
        System.out.println("John repaid his loan after " + sum + " months. His current account balance at that time was " + johnCurrent.getBalance() + " £");

        for (int i = 0; i < 200; i++) {
            if (maryLoanAccount.getBalance() + maryLoanAccount.getInterest() > 0) {
                maryLoanAccount.makePayment(250);
                maryLoanAccount.addInterest();

                marySavingsAccount.makeDeposit(950);
                marySavingsAccount.addInterest();
                sum = i;
            }
        }
        System.out.println("Mary repaid her loan after " + sum + " months. Her savings account balance at that time was " + marySavingsAccount.getBalance() + " £");


    }
}
