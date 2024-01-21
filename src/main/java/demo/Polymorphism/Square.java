package demo.Polymophism;

public class Square implements Shape {
    public void area(double a, double b) {
        a=b;
        System.out.println("Area of Square is "+ a*b);

    }

    @Override
    public void area() {

    }
}
