package FACTORY.packagefactory;

import FACTORY.microprocessorSubSystemfactory.ATMega32SubSystemFactory;
import display.Display;
import display.LCD;
import microprocessorsubsystem.MicroprocessorSubSystem;
import pacKage.Basic;
import pacKage.Package;
import microprocessorsubsystem.ATMega32SubSystem;

public class BasicPackageFactory implements PackageFactory{
    @Override
    public Package createPackage(){
        return new Basic(this.createMicroprocessorSubSystem(), this.createDisplay());
    }
    @Override
    public MicroprocessorSubSystem createMicroprocessorSubSystem(){
        ATMega32SubSystemFactory factory = new ATMega32SubSystemFactory();
        return new ATMega32SubSystem(factory.createMicroprocessor(), factory.createStorage(), factory.createIdentification(),factory.createController());
    }
    @Override
    public Display createDisplay(){
        return new LCD();
    }
}
