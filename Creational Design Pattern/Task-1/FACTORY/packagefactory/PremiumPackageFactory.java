package FACTORY.packagefactory;

import FACTORY.microprocessorSubSystemfactory.RaspberryPiSubSystemFactory;
import display.Display;
import display.TouchScreen;
import microprocessorsubsystem.MicroprocessorSubSystem;
import microprocessorsubsystem.RaspberryPiSubSystem;
import pacKage.Package;
import pacKage.Premium;

public class PremiumPackageFactory implements PackageFactory{
    @Override
    public Package createPackage(){
        return new Premium(this.createMicroprocessorSubSystem(), this.createDisplay());
    }
    @Override
    public MicroprocessorSubSystem createMicroprocessorSubSystem(){
        RaspberryPiSubSystemFactory factory = new RaspberryPiSubSystemFactory();
        return new RaspberryPiSubSystem(factory.createMicroprocessor(), factory.createStorage(), factory.createIdentification(),factory.createController());
    }
    @Override
    public Display createDisplay(){
        return new TouchScreen();
    }
}
