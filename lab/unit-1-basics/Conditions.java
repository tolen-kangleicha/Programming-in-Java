public class Conditions {
  public static void main(String[] args) {
    int i = 3;
    if (i > 5) {
      System.out.println(i + " is greater than 5.");
    } else {
      System.out.println(i + " is less than 5.");
    }

    for (i = 0; i <10; i++) {
      if (i == 5)
        break;
      System.out.println(i);
    }

    switch (i) {
      case 1 -> System.out.println("It is one");
      case 2 -> System.out.println("It is one");
      case 3 -> System.out.println("It is one");
      case 4 -> System.out.println("It is one");
      case 5 -> System.out.println("It is one");
      default -> System.out.println("Its is NONE");
    }
  }
}
