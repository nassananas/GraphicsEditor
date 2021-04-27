package com.company;

public class Square extends Figure{
    int a;
    public Square(int x, int y, int a){
        this.x = x;
        this.y = y;
        this.a = a;
    }
    @Override
    void calculateArea() {
        this.area =  a*a;
    }
}
