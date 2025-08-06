package PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Vet v = new Vet();
        Dog d = new Dog();
        Animal h = new Hippo();

        v.giveShot(d);   
        v.giveShot(h);
    }
}


