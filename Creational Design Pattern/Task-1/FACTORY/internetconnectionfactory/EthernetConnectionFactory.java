package FACTORY.internetconnectionfactory;

import internetconnection.Ethernet;
import internetconnection.InternetConnection;

public class EthernetConnectionFactory implements InternetConnectionFactory{
    @Override
    public InternetConnection createInternetConnection(){
        return new Ethernet();
    }
}
