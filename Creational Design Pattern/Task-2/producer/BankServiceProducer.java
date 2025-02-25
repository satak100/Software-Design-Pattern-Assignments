package producer;

import factory.CustomerFactory;
import factory.RegularCustomerFactory;
import factory.PremiumCustomerFactory;
import factory.VIPCustomerFactory;

public class BankServiceProducer {
    public static CustomerFactory getFactory(String customerType) {
        if (customerType.equalsIgnoreCase("regular")) {
            return new RegularCustomerFactory();
        } else if (customerType.equalsIgnoreCase("premium")) {
            return new PremiumCustomerFactory();
        } else if (customerType.equalsIgnoreCase("vip")) {
            return new VIPCustomerFactory();
        } 
        throw new IllegalArgumentException("Invalid customer type");
    }
}
