package ro.siit.enums;

public class Person {
    private Month birthMonth;
    public void setBirthMonth(Month month){
        this.birthMonth = month;
    }

    public Month getBirthMonth() {
        return birthMonth;
    }

    public void executeCommand(Command command) {
        command.execute();
    }
}
