import java.util.Scanner;

public class NumConv {
    void convert(String sys, int val) {
        switch (sys) {
            case "bin" -> System.out.println("\nBinary: " + Integer.toBinaryString(val));
            case "oct" -> System.out.println("\nOctal: " + Integer.toOctalString(val));
            case "hex" -> System.out.println("\nHexadecimal: " + Integer.toHexString(val));
            default -> System.out.println("\nInvalid system");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a decimal number: ");
            int val = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the system to convert (bin, oct, hex): ");
            String sys = sc.nextLine();
            NumConv obj = new NumConv();
            obj.convert(sys, val);
        }
    }
}