package pacKage;

import display.Display;
import microprocessorsubsystem.MicroprocessorSubSystem;

public class Standard implements Package {
    private MicroprocessorSubSystem mpss;
    private Display d;

    public Standard(MicroprocessorSubSystem mpss, Display d){
        this.mpss = mpss;
        this.d = d;
    }
    @Override
    public String type_details(){
        return "Standard Has been added to the PACKAGE\n" + mpss.type_details() + d.type_details();
    }
    
}
