import java.util.Scanner;

class InvalidMarksException extends Exception {
  public InvalidMarksException(String message) {
    super(message);
  }
}

public class MarkValidator {
  static void validateMarks(String name, int marks) throws InvalidMarksException {
    if (marks < 0 || marks > 100) {
      throw new InvalidMarksException("Marks should be between 0 and 100.");
    } else {
      System.out.println("Marks for " + name + ": " + marks);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter student name: ");
    String name = sc.nextLine();

    System.out.print("Enter marks (0 - 100): ");
    int marks = sc.nextInt();

    try {
      validateMarks(name, marks);
    } catch (InvalidMarksException e) {
      System.out.println("Exception: " + e.getMessage());
    }

    sc.close();
  }
}
