import internetconnection.InternetConnection;
import webserver.Webserver;
import pacKage.Package;

public class Builder implements Abstract_Builder {
    SYSTEM system = new SYSTEM();

    public void BuildPackage(Package pkg){
        system.setPackage(pkg);
    }
    public void BuildInternetConnection(InternetConnection internet){
        system.setInternetConnection(internet);
    }
    public void BuildWebServer(Webserver web){
        system.setWebserver(web);
    }
    
    public SYSTEM getsystem()
    {
        return system;
    }

    
}
