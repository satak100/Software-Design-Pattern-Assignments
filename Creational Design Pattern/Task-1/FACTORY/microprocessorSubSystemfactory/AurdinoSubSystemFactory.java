package FACTORY.microprocessorSubSystemfactory;

import controller.Controller;
import controller.SeparateUnit;
import identification.Identification;
import identification.RFID;
import microprocessor.Aurdino;
import microprocessor.Microprocessor;
import storage.SDcard;
import storage.Storage;

public class AurdinoSubSystemFactory implements MicroprocessorSubSystemFactory {
    @Override
    public Microprocessor createMicroprocessor(){
        return new Aurdino();
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
