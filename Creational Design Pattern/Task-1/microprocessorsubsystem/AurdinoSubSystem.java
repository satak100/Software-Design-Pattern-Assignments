package microprocessorsubsystem;

import controller.Controller;
import identification.Identification;
import microprocessor.Microprocessor;
import storage.Storage;

public class AurdinoSubSystem implements MicroprocessorSubSystem{
    private Microprocessor mp;
    private Storage s;
    private Identification i;
    private Controller c;

    public AurdinoSubSystem(Microprocessor mp, Storage s, Identification i, Controller c){
        this.mp = mp;
        this.s = s;
        this.i = i;
        this.c = c;
    }
    @Override
    public String type_details(){
        return mp.type_details()+"\n"+s.type_details()+"\n"+i.type_details()+"\n"+c.type_details()+"\n";
    }
}
