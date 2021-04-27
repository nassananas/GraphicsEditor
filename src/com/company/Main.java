package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    static Figure[][] region = new Figure[100][100];

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = User.class.getMethods();

        for(Method m : methods){
            if(m.isAnnotationPresent(Shape.class)){
                Object obj = m.invoke(new User());
                try {
                    region = Editor.addFigure((Figure) obj, region);
                } catch (NotEnoughSpaceException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        for(var i = 0; i<region.length; i++){
            for(var j = 0; j<region[0].length; j++){
                if(region[i][j] != null){
                    String nameClass = region[i][j].getClass().getSimpleName();
                    String area = " имеет площадь " + region[i][j].area;
                    switch (nameClass){
                        case "Circle":
                            var circle = (Circle) region[i][j];
                            System.out.println("Круг с центром в точке [" + circle.x + "," + circle.y + "] радиусом " + circle.rad + area);
                            break;
                        case "Square":
                            var square = (Square) region[i][j];
                            System.out.println("Квадрат с центром в точке [" + square.x + "," + square.y + "] стороной " + square.a + area);
                            break;
                        case "Rectangle":
                            var rect = (Rectangle) region[i][j];
                            System.out.println("Прямоугольник с центром в точке [" + rect.x + "," + rect.y + "] высотой " + rect.a + " шириной " + rect.b + area);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
