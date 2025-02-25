package factory;

import account.VIPAccount;
import account.Account;
import loan.VIPLoan;
import loan.Loan;

public class VIPCustomerFactory implements CustomerFactory {
    @Override
    public Account createAccount() {
        return new VIPAccount();
    }

    @Override
    public Loan createLoan() {
        return new VIPLoan();
    }
}
