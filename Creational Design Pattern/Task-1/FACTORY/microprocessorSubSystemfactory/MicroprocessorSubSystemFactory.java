package FACTORY.microprocessorSubSystemfactory;

import controller.Controller;
import identification.Identification;
import microprocessor.Microprocessor;
import storage.Storage;

public interface MicroprocessorSubSystemFactory {
    Microprocessor createMicroprocessor();
    Identification createIdentification();
    Controller createController();
    Storage createStorage();
}
