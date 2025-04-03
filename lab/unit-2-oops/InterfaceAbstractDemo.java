import java.util.Scanner;

interface A {
    void m1();
    void m2();
    void m3();
    void m4();
}

abstract class B implements A {
    @Override
    public void m3() {
        System.out.println("I am in m3()");
    }
}

class C extends B {
    private String message;

    C(String message) {
        this.message = message;
    }

    @Override
    public void m1() {
        System.out.println("I am in m1(): " + message);
    }

    @Override
    public void m2() {
        System.out.println("I am in m2(): " + message);
    }

    @Override
    public void m4() {
        System.out.println("I am in m4(): " + message);
    }
}

public class InterfaceAbstractDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a message: ");
            String userInput = scanner.nextLine();

            A a = new C(userInput);
            a.m1();
            a.m2();
            a.m3();
            a.m4();
        }
    }
}