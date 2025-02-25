package account;

public class PremiumAccount implements Account {
    private final double INTEREST_RATE = 3.5;

    @Override
    public double calculateInterest(double amount, int years) {
        double interestRate = INTEREST_RATE / 100;
        return amount * Math.pow(1 + interestRate, years) - amount;
    }
}
