import java.util.Scanner;

public class OuterClass {
    private static String outerField;

    // Nested static class
    static class NestedClass {
        void display() {
            // Accessing static field of outer class
            System.out.println("Outer field: " + outerField);
        }
    }

    void createNestedClassInstance() {
        NestedClass nested = new NestedClass();
        nested.display();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a value for the outer field: ");
            String userInput = scanner.nextLine();

            OuterClass.outerField = userInput;
            OuterClass outer = new OuterClass();
            outer.createNestedClassInstance();
        }
    }
}