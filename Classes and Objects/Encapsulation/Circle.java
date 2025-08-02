package Encapsulation;

public class Circle extends Shape {
    private double radius;

    public void setRadius( double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void rotate() {
        System.out.println("Gracefully rotating circle: " + getName());
    }

    @Override
    public void playSound() {
        System.out.println("Melodiously playing circle sound for: " + getName());
    }
}
