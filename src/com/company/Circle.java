package com.company;

public class Circle extends Figure{
    int rad;
    double p = 3.14;
    public Circle(int x, int y, int rad){
        this.x = x;
        this.y = y;
        this.rad = rad;
    }
    @Override
    void calculateArea() {
        this.area = (int)p*rad*rad;
    }
}
