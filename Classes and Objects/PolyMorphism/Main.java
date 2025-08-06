package PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Vet v = new Vet();
        Dog d = new Dog();
        Animal h = new Hippo();
        Animal a = new Animal(); // why will it not compile?
        v.giveShot(d);   
        v.giveShot(h);
    }
}


