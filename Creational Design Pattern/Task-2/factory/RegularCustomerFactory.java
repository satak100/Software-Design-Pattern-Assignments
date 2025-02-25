package factory;

import account.RegularAccount;
import account.Account;
import loan.RegularLoan;
import loan.Loan;

public class RegularCustomerFactory implements CustomerFactory {
    @Override
    public Account createAccount() {
        return new RegularAccount();
    }

    @Override
    public Loan createLoan() {
        return new RegularLoan();
    }
}
