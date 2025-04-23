public class Program03_LargestCommandLine {
    public static void main(String[] args) {
        if (args.length < 10) {
            System.out.println("Please provide 10 integer numbers as command line arguments.");
            return;
        }
        int max = Integer.parseInt(args[0]);
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) max = num;
        }
        System.out.println("Largest number: " + max);
    }
}