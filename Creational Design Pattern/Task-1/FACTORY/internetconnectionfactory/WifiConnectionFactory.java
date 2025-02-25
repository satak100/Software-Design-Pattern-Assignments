package FACTORY.internetconnectionfactory;

import internetconnection.InternetConnection;
import internetconnection.Wifi;

public class WifiConnectionFactory implements InternetConnectionFactory {
    @Override
    public InternetConnection createInternetConnection(){
        return new Wifi();
    }
    
}
