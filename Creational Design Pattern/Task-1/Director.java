import internetconnection.InternetConnection;
import webserver.Webserver;
import pacKage.Package;

public class Director {
    public Builder builder = null;
    
    Director(Builder builder){
        this.builder = builder;
    }

    public void CreateSYSTEM(Package pkg, Webserver web, InternetConnection internet){
        builder.BuildPackage(pkg);
        builder.BuildWebServer(web);
        builder.BuildInternetConnection(internet);
    }
}
