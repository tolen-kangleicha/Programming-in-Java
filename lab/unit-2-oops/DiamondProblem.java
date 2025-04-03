interface A {
    void method();
}

interface B extends A {
    @Override
    default void method() {
        System.out.println("B");
    }
}

interface C extends A {
    @Override
    default void method() {
        System.out.println("C");
    }
}

class Diamond implements B, C {
    @Override
    public void method() {
        B.super.method();
        C.super.method();
    }
}
public class DiamondProblem {
    public static void main(String[] args) {
        Diamond d = new Diamond();
        d.method();
    }    
}
