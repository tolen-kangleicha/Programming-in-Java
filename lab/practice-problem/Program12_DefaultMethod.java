interface MyInterface {
  default void show() {
    System.out.println("This is a default method in interface.");
  }
}

class Demo implements MyInterface {
  // No need to override show()
}

public class Program12_DefaultMethod {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.show();
  }
}
