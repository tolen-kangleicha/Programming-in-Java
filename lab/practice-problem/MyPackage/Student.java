package MyPackage;

public class Student {
  String name;
  int roll;
  int m1, m2, m3;

  public Student(String name, int roll, int m1, int m2, int m3) {
    this.name = name;
    this.roll = roll;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
  }

  public void display() {
    int total = m1 + m2 + m3;
    double percent = total / 3.0;
    String data =
        """
          name      : %s
          Roll      : %d
          Total     : %d
          Percentage: %.2f
        """
            .formatted(name, roll, total, percent);
    System.out.println(data);
  }
}
