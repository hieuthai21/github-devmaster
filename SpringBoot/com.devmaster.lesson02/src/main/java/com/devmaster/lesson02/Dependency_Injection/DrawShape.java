package com.devmaster.lesson02.Dependency_Injection;

interface Shape{
    void draw();
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("CircleShape draw");
    }
}
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("RectangleShape draw");
    }
}
public class DrawShape {
    private Shape shape;
    public DrawShape(Shape shape) {
        this.shape = shape;
    }
    public void draw() {
        shape.draw();
    }
    public static void main(String[] args) {
        DrawShape drawShape = new DrawShape(new Circle());
        drawShape.draw();
        drawShape = new DrawShape(new Rectangle());
        drawShape.draw();
    }
}
