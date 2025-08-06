package PolyMorphism;

public class Animal {
    public void makeNoise(){
        System.out.println("Animal Noise");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise(){ System.out.println("Dog Sound: Bufff!");}
    
}

class Hippo extends Animal {
    @Override
    public void makeNoise(){ System.out.println("Hippo SOund: Grunt!"); }
}