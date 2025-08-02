package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Shape s = new Circle();
        s.setName("Harsh");  // encapsulation: each object has it's own name set 
        System.out.println(s.getName()); 
        s.rotate(); // this will be called for Circle object as it had rotate method which over-rode superClass's rotate (polymorphism)
    }
}