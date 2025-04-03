import java.util.HashMap;

public class FirstRepeatingElement {
    public static int firstRepeating(int[] arr) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (indexMap.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, indexMap.get(arr[i]));
            } else {
                indexMap.put(arr[i], i);
            }
        }

        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex + 1; // Convert 0-based index to 1-based
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeating(arr));  // Output: 2
    }
}
