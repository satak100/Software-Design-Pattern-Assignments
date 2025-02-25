package FACTORY.microprocessorSubSystemfactory;

import controller.Controller;
import controller.TouchScreen;
import identification.Identification;
import identification.NFC;
import microprocessor.Microprocessor;
import microprocessor.RaspberryPi;
import storage.Attached;
import storage.Storage;

public class RaspberryPiSubSystemFactory implements MicroprocessorSubSystemFactory {
    @Override
    public Microprocessor createMicroprocessor(){
        return new RaspberryPi();
    }
    @Override
    public Identification createIdentification(){
        return new NFC();
    }
    @Override
    public Controller createController(){
        return new TouchScreen();
    }
    @Override
    public Storage createStorage(){
        return new Attached();
    }

}