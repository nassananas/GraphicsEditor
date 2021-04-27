package com.company;

public class Editor {


    public static Figure[][] addFigure(Figure figure, Figure[][] region) throws NotEnoughSpaceException {
        String nameClass = figure.getClass().getSimpleName();
        if(figure.x >= 0 && figure.x < region.length && figure.y >=0 && figure.y <=region[0].length){
            String position = " с позицией [" +figure.x + "," + figure.y +"]";
            switch(nameClass){
                case "Circle":
                    var circle = (Circle) figure;
                    if (circle.x+circle.rad < region.length && circle.x-circle.rad > 0 && circle.y+circle.rad < region[0].length && circle.y-circle.rad > 0){
                            circle.calculateArea();
                            region[circle.x][circle.y] = circle;
                            break;
                    }
                    throw new NotEnoughSpaceException("Круг радиусом " + circle.rad + position);
                case "Rectangle":
                    var rect = (Rectangle) figure;
                    if(rect.y+rect.a < region[0].length && rect.x+rect.b < region.length){
                        rect.calculateArea();
                        region[rect.x][rect.y] = rect;
                        break;
                    }
                    throw new NotEnoughSpaceException("Прямоугольник со сторонами a=" + rect.a + " b=" + rect.b + position);

                case "Square":
                    var square = (Square) figure;
                    if(square.x+square.a < region.length && square.y+square.a < region[0].length){
                        square.calculateArea();
                        region[square.x][square.y] = square;
                        break;
                    }
                    throw new NotEnoughSpaceException("Квадрат со сторонами a=" + square.a + position);
                default:
                    break;
            }
            return region;
        }
        throw new NotEnoughSpaceException("Точка [" + figure.x + "," + figure.y + "] фигуры - " + nameClass + " выходит за пределы холста. " + nameClass);
    }
}
