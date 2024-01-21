package demo.Polymophism;

public interface Shape {
    default void area(double a, double b) {
//        System.out.print(a*b);

    }

    void area();
}
