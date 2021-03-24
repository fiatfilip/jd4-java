package ro.siit.functions;

public class Calculator {
    static float add(float a, float b){
        System.out.println(a + b);

        return a + b;
    }

    void alg1(){

    }

    static String alg2(double var1, String var2){

        return var1 + var2;
    }

    static int alg2(double var1){

        return 0;
    }

    public static double doubleFunction(){
        return -2.9;
    }

    public static void updateMyObj(String value, MyObject object){
        object.setMyProp(value);
    }

    public static int updatePrimitiveValue(int value){
        return ++value;
    }
}
