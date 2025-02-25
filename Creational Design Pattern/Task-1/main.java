import java.util.Scanner;

import FACTORY.internetconnectionfactory.EthernetConnectionFactory;
import FACTORY.internetconnectionfactory.GSMConnectionFactory;
import FACTORY.internetconnectionfactory.InternetConnectionFactory;
import FACTORY.internetconnectionfactory.WifiConnectionFactory;
import FACTORY.packagefactory.AdvancedPackageFactory;
import FACTORY.packagefactory.BasicPackageFactory;
import FACTORY.packagefactory.PackageFactory;
import FACTORY.packagefactory.PremiumPackageFactory;
import FACTORY.packagefactory.StandardPackageFactory;
import FACTORY.webserverfactory.DjangoFactory;
import FACTORY.webserverfactory.NodeJSFactory;
import FACTORY.webserverfactory.RubyFactory;
import FACTORY.webserverfactory.WebserverFactory;
import internetconnection.InternetConnection;
import pacKage.Package;
import webserver.Webserver;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Builder builder = new Builder();
        PackageFactory packageFactory;
        InternetConnectionFactory internetConnectionFactory;
        WebserverFactory webserverFactory;

        Package pkg;
        InternetConnection internetConnection;
        Webserver web;

        // Step 1: Choose Package
        System.out.println("Choose a package:");
        System.out.println("1. Basic (ATMega32 with LED display)");
        System.out.println("2. Standard (Arduino Mega with LCD display)");
        System.out.println("3. Advanced (Raspberry Pi with OLED display)");
        System.out.println("4. Premium (Raspberry Pi with touch screen display)");
        int packageChoice = scanner.nextInt();

        switch (packageChoice) {
            case 1:
                packageFactory = new BasicPackageFactory();
                pkg = packageFactory.createPackage();
                break;
            case 2:
                packageFactory = new StandardPackageFactory();
                pkg = packageFactory.createPackage();
                break;
            case 3:
                packageFactory = new AdvancedPackageFactory();
                pkg = packageFactory.createPackage();
                break;
            case 4:
                packageFactory = new PremiumPackageFactory();
                pkg = packageFactory.createPackage();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        // Step 2: Choose Internet Connection
        System.out.println("Choose internet connection:");
        switch (packageChoice) {
            case 1:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                break;

            case 2:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                break;

            case 3:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                System.out.println("3. Ethernet");
                break;

            case 4:
                System.out.println("1. WiFi");
                System.out.println("2. GSM MOdule");
                System.out.println("3. Ethernet");
                break;

            default:
                System.out.println("Invalid choice!");
                return;

        }
      
        int internetChoice = scanner.nextInt();

        switch (internetChoice) {
            case 1:
                internetConnectionFactory = new WifiConnectionFactory();
                internetConnection = internetConnectionFactory.createInternetConnection();
                break;
            case 2:
                internetConnectionFactory = new GSMConnectionFactory();
                internetConnection = internetConnectionFactory.createInternetConnection();
                break;
            case 3:
                internetConnectionFactory = new EthernetConnectionFactory();
                internetConnection = internetConnectionFactory.createInternetConnection();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Step 3: Choose Web Server Framework
        System.out.println("Choose a web server framework:");
        System.out.println("1. Django");
        System.out.println("2. NodeJS");
        System.out.println("3. Ruby");
        int serverChoice = scanner.nextInt();

        switch (serverChoice) {
            case 1:
                webserverFactory = new DjangoFactory();
                web = webserverFactory.createWebserver();
                break;
            case 2:
                webserverFactory = new NodeJSFactory();
                web = webserverFactory.createWebserver();
                break;
            case 3:
                webserverFactory = new RubyFactory();
                web = webserverFactory.createWebserver();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        Director director= new Director(builder);
        director.CreateSYSTEM(pkg, web, internetConnection);
        SYSTEM system= builder.getsystem();

        System.out.println(system);

    }
    
}
