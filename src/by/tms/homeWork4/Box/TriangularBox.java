package by.tms.homeWork4.Box;

import by.tms.homeWork4.Shapes.Shape;

public class TriangularBox extends Box {
    public TriangularBox(double length, double height) {
        super(length, height);
        square = (length * length*(97/56d))/4; // 97/56d - максимально приближенное число к кв.корню из 3
        volume = square * height;
    }
    public void fillTheBox(Shape shape1, Shape shape2, Shape shape3) {
        System.out.println("Заполняем треугольную коробку разными фигурами по очереди");
        System.out.println("Текущий объем треугольной коробки : "+volume);
        System.out.println("В треугольной коробке сейчас лежат: ");
        getCounter();
        super.fillTheBox(shape1, shape2, shape3);
    }
    public void fillWithSame (Shape shape){
        switch (shape.name){
            case "Цилиндр": System.out.println("Заполним треугольную коробку Цилиндрами"); break;
            case "Пирамида": System.out.println("Заполним треугольную коробку Пирамидами"); break;
            case "Шар": System.out.println("Заполним треугольную коробку Шарами"); break;
        }
        System.out.println("Текущий объем треугольной коробки : "+volume);
        System.out.println("В треугольной коробке сейчас лежат: ");
        getCounter();
        super.fillWithSame(shape);
    }
}
