package pacKage;

import display.Display;
import microprocessorsubsystem.MicroprocessorSubSystem;

public class Basic implements Package {
    private MicroprocessorSubSystem mpss;
    private Display d;

    public Basic(MicroprocessorSubSystem mpss, Display d){
        this.mpss = mpss;
        this.d = d;
    }
    @Override
    public String type_details(){
        return "Basic Has been added to the PACKAGE\n" + mpss.type_details() + d.type_details();
    }
    
}
