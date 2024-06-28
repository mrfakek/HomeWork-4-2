package by.tms.homeWork4.Box;

import by.tms.homeWork4.Shapes.Shape;

public class OctagonalBox extends Box{
   public OctagonalBox(double length, double height) {
        super(length, height);
        square=2*length*length*((99/70d)+1); // 99/70d - максимально приближенное число к кв.корню из 2
        volume = square * height;
    }
    public void fillTheBox(Shape shape1, Shape shape2, Shape shape3) {
        System.out.println("Заполняем шестиугольную коробку разными фигурами по очереди");
        System.out.println("Текущий объем шестиугольной коробки : "+volume);
        System.out.println("В шестиугольной коробке сейчас лежат: ");
        getCounter();
        super.fillTheBox(shape1, shape2, shape3);
    }
    public void fillWithSame (Shape shape){
           switch (shape.name){
               case "Цилиндр": System.out.println("Заполним шестиугольную коробку Цилиндрами"); break;
               case "Пирамида": System.out.println("Заполним шестиугольную коробку Пирамидами"); break;
               case "Шар": System.out.println("Заполним шестиугольную коробку Шарами"); break;
           }
        System.out.println("Текущий объем шестиугольной коробки : "+volume);
        System.out.println("В шестиугольной коробке сейчас лежат: ");
        getCounter();
       super.fillWithSame(shape);
    }
    public boolean add (Shape shape) {
        switch (shape.name){
            case "Цилиндр": System.out.println("Положим в шестиугольную коробку Цилиндр"); break;
            case "Пирамида": System.out.println("Положим в шестиугольную коробку Пирамиду"); break;
            case "Шар": System.out.println("Положим в шестиугольную коробку Шар"); break;
        }
        System.out.println("Текущий объем шестиугольной коробки : "+volume);
        System.out.println("В шестиугольной коробке сейчас лежат: ");
        getCounter();
       return super.add(shape);
    }
}
