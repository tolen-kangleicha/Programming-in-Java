public class Loops {
  public static void main(String[] args) {
    // for loop
    System.out.println("\n---for loop---\n");
    for (int i = 0; i <= 5; i++) {
      System.out.println(i);
    }

    // while loop
    System.out.println("\n---while loop---\n");
    int i = 0;
    while (i <= 5) {
      System.out.println(i);
      i++;
    }

    // do-while loop
    System.out.println("\n---do-while loop---\n");
    i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i <= 5);
  }
}

