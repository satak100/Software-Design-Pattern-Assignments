import account.Account;
import loan.Loan;
import factory.CustomerFactory;
import producer.BankServiceProducer;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Select customer type: ");
            System.out.println("1 -> Regular");
            System.out.println("2 -> Premium");
            System.out.println("3 -> VIP");
            System.out.println("0 -> Exit");
            int customerTypeInput = scanner.nextInt();

            if (customerTypeInput == 0) {
                exit = true;
                System.out.println("Exiting the system...");
                break;
            }

            CustomerFactory factory;
            switch (customerTypeInput) {
                case 1:
                    factory = BankServiceProducer.getFactory("regular");
                    break;
                case 2:
                    factory = BankServiceProducer.getFactory("premium");
                    break;
                case 3:
                    factory = BankServiceProducer.getFactory("vip");
                    break;
                default:
                    System.out.println("Invalid customer type. Please try again.");
                    continue;
            }

            System.out.println("Choose service type (1 for Account, 2 for Loan, 0 to Exit): ");
            int serviceType = scanner.nextInt();

            if (serviceType == 0) {
                exit = true;
                System.out.println("Exiting the system...");
                break;
            }

            System.out.println("Enter amount and years for interest calculation:");
            double amount = scanner.nextDouble();
            int years = scanner.nextInt();

            // Account or Loan Service
            switch (serviceType) {
                case 1:
                    Account account = factory.createAccount();
                    System.out.println("Account Interest: " + account.calculateInterest(amount, years));
                    break;
                case 2:
                    Loan loan = factory.createLoan();
                    System.out.println("Loan Interest: " + loan.calculateInterest(amount, years));
                    break;
                default:
                    System.out.println("Invalid service type. Please try again.");
                    break;
            }

            scanner.nextLine();
            System.out.println("-------------------------------------");
        }

        scanner.close();
    }
}
