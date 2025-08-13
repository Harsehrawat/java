package PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Vet v = new Vet();
        Dog d = new Dog();
        Animal h = new Hippo();
        Animal a = new Animal(); // it will compile but think, do we need to allow the user to have an object of Animal type itself? HINT: Interfaces.
        v.giveShot(d);   
        v.giveShot(h);
    }
}


