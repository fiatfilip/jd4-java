package ro.siit.javaoop1.interfaces;

public class MickeyMouseVoter implements Voter{

    @Override
    public String vote() {
        return "I vote for Mickey";
    }

    @Override
    public void x() {

    }

    @Override
    public String x(int nr) {
        return null;
    }
}
