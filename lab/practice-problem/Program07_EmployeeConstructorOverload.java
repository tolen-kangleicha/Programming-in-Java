import java.util.Scanner;

class Employee {
  int id;
  String name;
  double salary;

  Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  void display() {
    String data =
        """
        ID      : %d
        Name    : %s
        Salary  : %.2f
        """
            .formatted(id, name, salary);
    System.out.println(data);
  }
}

public class Program07_EmployeeConstructorOverload {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employee[] emp = new Employee[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter id, name and salary: ");
      int id = sc.nextInt();
      String name = sc.next();
      double salary = sc.nextDouble();
      emp[i] = new Employee(id, name, salary);
    }

    for (Employee e : emp) {
      e.display();
    }
    sc.close();
  }
}
