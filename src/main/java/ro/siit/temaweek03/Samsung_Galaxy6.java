package ro.siit.temaweek03;

public class Samsung_Galaxy6 extends Phone implements modelConfigurables {

    @Override
    public void imei() {
        imeiGenerate();
    }

    @Override
    public void batteryLife(){
        System.out.println("Battery life is: "+phoneBatteryLife());
    }

    @Override
    public void color() {
        phoneColor();

//        String color1= phoneColor();
//        System.out.println("Color of the phone is from color () "+color1);
    }

    @Override
    public void material (){
        phoneMaterial();

//        String material =    phoneMaterial();
//        System.out.println("Material is from material () "+material);
    }
}


