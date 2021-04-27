package com.company;

public class User {

    @Shape
    public Circle createCircle1(){
        return new Circle(110, 50, 20);
    }
    @Shape
    public Circle createCircle2(){
        return new Circle(50, 50, 20);
    }
    @Shape
    public Rectangle createRectangle1(){
        return new Rectangle(20,20,10,10);
    }
    public Rectangle createRectangle2(){
        return new Rectangle(20,20,10,10);
    }
    @Shape
    public Square createSquare1(){
        return new Square(40,40,30);
    }
    @Shape
    public Square createSquare2(){
        return new Square(40,40,200);
    }
}
