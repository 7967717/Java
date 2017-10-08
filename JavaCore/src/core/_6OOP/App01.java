package core._6OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RomanR on 04-Jun-14.
 */
public class App01 {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle());
        figures.add(new Rectangle());

        new Drawer().drawAll(figures );
    }
}

class Drawer{
    public void drawAll(List<Figure> figures){
        for(Figure figure : figures){
            figure.draw();
        }
    }
}

interface Figure{
   public void draw();
}

class Circle implements Figure{

    @Override
    public void draw() {
        System.out.println("this is circle");
    }
}

class Rectangle implements Figure{

    @Override
    public void draw() {
        System.out.println("this is rectangle");
    }
}

class X {
    public static void f(){}
}

class Y extends X{

}
