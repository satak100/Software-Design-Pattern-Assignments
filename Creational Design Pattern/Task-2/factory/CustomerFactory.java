package factory;

import account.Account;
import loan.Loan;

public interface CustomerFactory {
    Account createAccount();
    Loan createLoan();
}
