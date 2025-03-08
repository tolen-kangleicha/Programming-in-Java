class Outer2 {
    int x = 20;
    class Inner2 {
        void method() {
            System.out.println("Inner class method executed: and x == " + x);
        }
    }
}

class StaticDemo{
    public static void main(String[] args) {
        Outer2 outobj = new Outer2();
        Outer2.Inner2 inobj = outobj.new Inner2();

        inobj.method();
    }
}