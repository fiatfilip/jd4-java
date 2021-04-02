package ro.siit.javaoop1.interfaces;

public class Adult extends Person implements Voter, SchoolBoardInterractor{

    public Adult(String name) {
        super(name);
    }

    public String vote(){
        return getName() + "->Trump";
    }

    @Override
    public void talkToPrincipal() {
        System.out.println("What did my child do?");
    }

    public void x(){

    }

    public String x(int nr){
        return "";
    }
}
