import java.util.HashSet;

public class ZeroSumSubarray {
  public static String zeroSum(int[] A) {
    HashSet<Integer> prefixSums = new HashSet<>();
    int runningSum = 0;

    for (int num : A) {
      runningSum += num;
      if (runningSum == 0 || prefixSums.contains(runningSum)) {
        return "Yes";
      }
      prefixSums.add(runningSum);
    }
    return "No";
  }

  public static void main(String[] args) {
    int[] A = {4, 2, -3, 1, 6};
    System.out.println(zeroSum(A));
  }
}
