package ro.siit.enums;

public enum Command {
    CLOSE_RIGHT_REAR_DOOR("01"), OPEN_FRON_LEFT_DOOR("02");

    private String code;

    Command(String code){
        this.code = code;
    }

    public void execute(){
        System.out.println(this.name() + "(" + this.code + ") executed!");
    }
}
