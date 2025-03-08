import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    private RomanToInteger() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static int romanToInteger(String roman) {
        roman = roman.toUpperCase();
        HashMap<Character, Integer> myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = myMap.get(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        
        return total;
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a roman numeral: ");
            String roman = in.nextLine();

            System.out.print("\nInteger value: " + romanToInteger(roman));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
