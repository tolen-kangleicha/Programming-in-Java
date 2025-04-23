class Base {
  protected int value = 100;

  protected void display() {
    System.out.println("Protected value: " + value);
  }
}

public class Program13_ProtectedAccess extends Base {
  public static void main(String[] args) {
    Program13_ProtectedAccess obj = new Program13_ProtectedAccess();
    obj.display(); // Accessible due to inheritance
  }
}
