import internetconnection.InternetConnection;
import webserver.Webserver;
import pacKage.Package;

public interface Abstract_Builder {
     void BuildPackage(Package pkg);
     void BuildInternetConnection(InternetConnection internet);
     void BuildWebServer(Webserver web);
}
