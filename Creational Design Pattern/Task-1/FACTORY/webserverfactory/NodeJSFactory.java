package FACTORY.webserverfactory;

import webserver.NodeJS;
import webserver.Webserver;

public class NodeJSFactory implements WebserverFactory {
    @Override
    public Webserver createWebserver(){
        return new NodeJS();
    }
}
