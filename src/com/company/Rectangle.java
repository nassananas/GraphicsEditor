package com.company;

public class Rectangle extends Figure {
    int a;
    int b;
    public Rectangle(int x, int y, int a, int b){
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }
    @Override
    void calculateArea() {
        this.area =  a*b;
    }
}
