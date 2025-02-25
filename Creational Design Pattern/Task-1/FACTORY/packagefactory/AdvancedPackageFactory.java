package FACTORY.packagefactory;

import FACTORY.microprocessorSubSystemfactory.RaspberryPiSubSystemFactory;
import display.Display;
import display.OLED;
import microprocessorsubsystem.RaspberryPiSubSystem;
import microprocessorsubsystem.MicroprocessorSubSystem;
import pacKage.Package;
import pacKage.Advanced;

public class AdvancedPackageFactory implements PackageFactory{
    @Override
    public Package createPackage(){
        return new Advanced(this.createMicroprocessorSubSystem(), this.createDisplay());
    }

    @Override
    public MicroprocessorSubSystem createMicroprocessorSubSystem(){
        RaspberryPiSubSystemFactory factory = new RaspberryPiSubSystemFactory();
        return new RaspberryPiSubSystem(factory.createMicroprocessor(), factory.createStorage(), factory.createIdentification(),factory.createController());
    }
    @Override
    public Display createDisplay(){
        return new OLED();
    }
}
