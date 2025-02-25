package FACTORY.internetconnectionfactory;

import internetconnection.GSM;
import internetconnection.InternetConnection;

public class GSMConnectionFactory implements InternetConnectionFactory{
    @Override
    public InternetConnection createInternetConnection(){
        return new GSM();
    }
}
