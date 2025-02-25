package FACTORY.webserverfactory;

import webserver.Django;
import webserver.Webserver;

public class DjangoFactory implements WebserverFactory{
    @Override
    public Webserver createWebserver(){
        return new Django();
    }
}
