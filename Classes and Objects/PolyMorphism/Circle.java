package PolyMorphism;

public class Circle extends Shape{
    @Override 
    void rotate(){ System.out.println("rotate Circle"); }

    @Override
    void playSound(){ System.out.println("playSound Circle"); }
}