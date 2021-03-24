package ro.siit.functions;

public class Main {
    public static void main(String[] args) {
        float sum = Calculator.add(2.2f, 3.3f);
        System.out.println(sum);

        new Calculator().alg1();

        System.out.println(Calculator.alg2(2.5, "3"));
        int var2 = Calculator.alg2(2.5);

        int variable = (int)Math.floor(Calculator.doubleFunction());
        System.out.println(variable);

        MyObject myObject = new MyObject();
        myObject.setMyProp("Filip");
        System.out.println(myObject.getMyProp());
        Calculator.updateMyObj("John", myObject);
        System.out.println(myObject.getMyProp());

        int val = 7;
        val = Calculator.updatePrimitiveValue(val);
        System.out.println(val);
    }
}
