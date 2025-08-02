package Encapsulation;

public class Shape {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rotate(){
        System.out.println("rotate Shape");
    }

    public void playSound(){ System.out.println("playSound Shape");}
}
