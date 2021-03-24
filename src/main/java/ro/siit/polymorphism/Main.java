package ro.siit.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[5];

        shapes[0] = new Shape();
        shapes[1] = new Triangle();
        // shapes[1].flipHorizontally();
        shapes[2] = new Square();
        shapes[3] = new Circle();
        shapes[4] = new Square();

        Triangle [] triangles = new Triangle[50];
        for (int i = 0; i < 50; i++) {
            triangles[i] = new Triangle();
        }

        for (Shape shape: shapes) {
            shape.whoami();
            if(shape instanceof Triangle) {
                Triangle tr = (Triangle) shape;
                tr.changeValue(2);
                tr.whoami();
                System.out.println(tr.getValue());
                tr.flipHorizontally();

                Triangle anotherTr = (Triangle) shape;
                anotherTr.changeValue(3);

                System.out.println(tr.getValue());

            }
        }
    }
}
