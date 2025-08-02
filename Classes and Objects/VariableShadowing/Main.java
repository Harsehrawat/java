package VariableShadowing;


public class Main {

    public static void main(String[] args) {
        Shape s  = new Circle();
        System.out.println(s.name); // Shape 
        s.getName(); // Circle
    }
}

// 🌘 2. Variable Shadowing
// ❌ Applies to: Fields, not methods
// If a subclass declares a field with the same name as one in the superclass, it hides or shadows the superclass field — but not override it (fields can't be overridden in Java).

// s.name returns Shape name not Circle name . WHy?
// Because field access is resolved at compile time, based on the reference type, not the object type.
// s is of type Shape → Java uses Shape.name
// Even though the actual object is a Circle, field access is not polymorphic
