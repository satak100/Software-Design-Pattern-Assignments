package FACTORY.packagefactory;

import FACTORY.microprocessorSubSystemfactory.AurdinoSubSystemFactory;
import display.Display;
import display.LED;
import microprocessorsubsystem.MicroprocessorSubSystem;
import pacKage.Package;
import pacKage.Standard;
import microprocessorsubsystem.AurdinoSubSystem;

public class StandardPackageFactory implements PackageFactory{
    @Override
    public Package createPackage(){
        return new Standard(this.createMicroprocessorSubSystem(), this.createDisplay());
    }
    @Override
    public MicroprocessorSubSystem createMicroprocessorSubSystem(){
        AurdinoSubSystemFactory factory = new AurdinoSubSystemFactory();
        return new AurdinoSubSystem(factory.createMicroprocessor(), factory.createStorage(), factory.createIdentification(),factory.createController());
    }
    @Override
    public Display createDisplay(){
        return new LED();
    }
    
}
