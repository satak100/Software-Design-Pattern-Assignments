package pacKage;

import display.Display;
import microprocessorsubsystem.MicroprocessorSubSystem;

public class Advanced implements Package {
    private MicroprocessorSubSystem mpss;
    private Display d;

    public Advanced(MicroprocessorSubSystem mpss, Display d){
        this.mpss = mpss;
        this.d = d;
    }

    @Override
    public String type_details(){
        return "Advanced Has been added to the PACKAGE\n" + mpss.type_details() + d.type_details();
    }
}
