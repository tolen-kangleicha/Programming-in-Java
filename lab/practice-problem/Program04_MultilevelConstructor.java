class A {
  A() {
    System.out.println("Constructor of A");
  }
}

class B extends A {
  B() {
    System.out.println("Constructor of B");
  }
}

class C extends B {
  C() {
    System.out.println("Constructor of C");
  }
}

public class Program04_MultilevelConstructor {
  public static void main(String[] args) {
    C obj = new C();
  }
}
