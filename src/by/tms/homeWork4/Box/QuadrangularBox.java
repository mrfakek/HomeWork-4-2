package by.tms.homeWork4.Box;

import by.tms.homeWork4.Shapes.Shape;

public class QuadrangularBox extends Box {
    double width;
    public QuadrangularBox(double length, double _width, double height) {
        super(length, height);
        width = _width;
        square = length * width;
        volume = square * height;
    }
    public void fillTheBox(Shape shape1, Shape shape2, Shape shape3) {
        System.out.println("Заполняем четырехугольную коробку разными фигурами по очереди");
        System.out.println("Текущий объем четырехугольной коробки : "+volume);
        System.out.println("В четырехугольной коробке сейчас лежат: ");
        getCounter();
        super.fillTheBox(shape1, shape2, shape3);
    }
    public void fillWithSame (Shape shape){
        switch (shape.name){
            case "Цилиндр": System.out.println("Заполним четырехугольную коробку Цилиндрами"); break;
            case "Пирамида": System.out.println("Заполним четырехугольную коробку Пирамидами"); break;
            case "Шар": System.out.println("Заполним четырехугольную коробку Шарами"); break;
        }
        System.out.println("Текущий объем четырехугольной коробки : "+volume);
        System.out.println("В четырехугольной коробке сейчас лежат: ");
        getCounter();
        super.fillWithSame(shape);
    }
}
