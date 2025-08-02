package ;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.rotate();     // Output: Rotating Circle
        s.playSound();  // Output: PlaySound Circle
    }
}


// here mention SuperClass, subclass, object , reference variable and polymorpishm .
// SuperClass: Shape , SubCLass: Circle, Object: Circle (in-memory during run-time), ref Var.: s
// Polymorphism: it means Object behaves differently based on its own actual class.
    // we saw polymorphism when s.rotate and s.playSOund were called for Circle not for Shape superclass as circle mehtods over-rode Superclass methods