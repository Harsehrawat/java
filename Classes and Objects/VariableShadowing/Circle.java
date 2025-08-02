package VariableShadowing;

public class Circle extends Shape{
    private String name = "Circle";

    @Override
    public void getName(){ System.out.println(name);}
}