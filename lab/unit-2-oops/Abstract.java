import java.util.Scanner;

abstract class Shape {
    private final int a, b; // Instance variables

    Shape(final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(final int a, final int b) {
        super(a, b);
    }

    @Override
    void printArea() {
        System.out.println("Area of rectangle: " + (getA() * getB()));
    }
}

class Triangle extends Shape {
    private static final double HALF = 0.5; // Constant

    Triangle(final int a, final int b) {
        super(a, b);
    }

    @Override
    void printArea() {
        System.out.println("Area of triangle: " + (HALF * getA() * getB()));
    }
}

final class Abstract {
    Abstract() {
        System.out.println("Abstract class constructor");
    }

    void print() {
        System.out.println("Abstract class method");
    }

    public static void main(final String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the dimensions of the rectangle: ");
            int a = in.nextInt();
            int b = in.nextInt();
            Shape s = new Rectangle(a, b);
            s.printArea();

            System.out.println("Enter the dimensions of the triangle: ");
            a = in.nextInt();
            b = in.nextInt();
            s = new Triangle(a, b);
            s.printArea();

            Abstract a1 = new Abstract();
            a1.print();
        }
    }
}
