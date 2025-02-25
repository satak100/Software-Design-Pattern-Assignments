package FACTORY.packagefactory;

import display.Display;
import microprocessorsubsystem.MicroprocessorSubSystem;
import pacKage.Package;

public interface PackageFactory {
    Package createPackage();
    MicroprocessorSubSystem createMicroprocessorSubSystem();
    Display createDisplay();
}
