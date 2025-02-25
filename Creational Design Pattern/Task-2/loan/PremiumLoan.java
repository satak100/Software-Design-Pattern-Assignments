package loan;

public class PremiumLoan implements Loan {
    private final double INTEREST_RATE = 12.0;

    @Override
    public double calculateInterest(double amount, int years) {
        double interestRate = INTEREST_RATE / 100;
        return amount * Math.pow(1 + interestRate, years) - amount;
    }
}
