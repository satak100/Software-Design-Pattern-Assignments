import internetconnection.InternetConnection;
import webserver.Webserver;
import pacKage.Package;

public class SYSTEM {
    private Package pkg = null;
    private InternetConnection internet = null;
    private Webserver web = null;

    void setPackage(Package pkg){
        this.pkg = pkg;
    }

    void setInternetConnection(InternetConnection internet){
        this.internet = internet;
    }

    void setWebserver(Webserver web){
        this.web = web;
    }

    @Override
    public String toString(){
        return pkg.type_details() + "\n" + internet.type_details() + "\n" + web.type_details();
    }
}
