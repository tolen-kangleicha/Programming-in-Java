class CallByValue {
  void Swapping(int a, int b) {
    System.out.println("Before: " + a + " " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After: " + a + " " + b);
  }
}
class Swap {
  public static void main(String[] args) {
    int a = 3, b = 5;
    //System.out.println("Before: " + a + " " + b);

    //a = a + b;
    //b = a - b;
    //a = a - b;

    //a ^= b;
    //b ^= a;
    //a ^= b;

    // int temp = a;
    // a = b;
    // b = temp;

    // a = a + b - (b = a);
    CallByValue obj = new CallByValue();
    obj.Swapping(a, b);

    //System.out.println("After: " + a + " " + b);
  }
}
