package demo.Polymophism;

public class Rectangle implements Shape {
    public void area(double a, double b) {
        System.out.println("Area of Rectangle is "+ a*b);

    }

    @Override
    public void area() {

    }
}
