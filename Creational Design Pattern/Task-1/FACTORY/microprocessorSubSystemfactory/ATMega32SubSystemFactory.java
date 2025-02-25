package FACTORY.microprocessorSubSystemfactory;

import controller.Controller;
import controller.SeparateUnit;
import identification.Identification;
import identification.RFID;
import microprocessor.ATMega32;
import microprocessor.Microprocessor;
import storage.SDcard;
import storage.Storage;

public class ATMega32SubSystemFactory implements MicroprocessorSubSystemFactory {
    @Override
    public Microprocessor createMicroprocessor(){
        return new ATMega32();
    }
    @Override
    public Identification createIdentification(){
        return new RFID();
    }
    @Override
    public Controller createController(){
        return new SeparateUnit();
    }
    @Override
    public Storage createStorage(){
        return new SDcard();
    }

}
