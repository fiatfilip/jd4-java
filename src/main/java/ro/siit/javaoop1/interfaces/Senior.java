package ro.siit.javaoop1.interfaces;

public class Senior extends Person implements Voter {
    public Senior(String name) {
        super(name);
    }

    public String vote(){
        return getName() + "->Biden";
    }

    public void x(){

    }

    @Override
    public String x(int nr) {
        return null;
    }
}
