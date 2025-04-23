class Volume {
    void compute(int side) {
        System.out.println("Cube volume: " + (side * side * side));
    }

    void compute(int l, int b, int h) {
        System.out.println("Cuboid volume: " + (l * b * h));
    }
}

public class Program06_CuboidCubeOverload {
    public static void main(String[] args) {
        Volume v = new Volume();
        v.compute(5);           // cube
        v.compute(2, 3, 4);     // cuboid
    }
}