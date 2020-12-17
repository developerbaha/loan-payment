package uk.keele.assigment;

import uk.keele.assigment.accounts.CurrentAccount;
import uk.keele.assigment.accounts.LoanAccount;
import uk.keele.assigment.accounts.SavingsAccount;

public class Main {

    public static void main(String[] args) {
	// write your code here







        CurrentAccount johnCurrent = new CurrentAccount(0);
        LoanAccount johnLoan = new LoanAccount(20000);

        LoanAccount maryLoanAccount = new LoanAccount(15000);
        SavingsAccount marySavingsAccount = new SavingsAccount(100);


        // aylık ödemeler
        for (int i = 0; i < 200; i++) {

            //////////////////////////////////////////
            if(johnLoan.getBalance()>=0) {
                johnCurrent.makeDeposit(600);
                johnLoan.addInterest();

                johnLoan.makePayment(200);
                johnLoan.addInterest();
            }
            //////////////////////////////////////////
            if(maryLoanAccount.getBalance()>0) {
                maryLoanAccount.makePayment(250);
                maryLoanAccount.addInterest();

                marySavingsAccount.makeDeposit(950);
                //marySavingsAccount.addInterest();
            }
            //////////////////////////////////////////
        }


    }
}
