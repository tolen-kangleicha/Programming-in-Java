import java.util.*;

public class PossiblePalin{
    public static String canFormPalindrome(String S) {
        S = S.toLowerCase();
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : S.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return (oddCount <= 1) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(canFormPalindrome("1122334"));
    }
}
