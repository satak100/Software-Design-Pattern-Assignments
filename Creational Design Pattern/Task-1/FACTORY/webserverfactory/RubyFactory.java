package FACTORY.webserverfactory;

import webserver.Ruby;
import webserver.Webserver;

public class RubyFactory implements WebserverFactory {
    @Override
    public Webserver createWebserver(){
        return new Ruby();
    }
}
