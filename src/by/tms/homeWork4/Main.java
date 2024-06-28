package by.tms.homeWork4;

import by.tms.homeWork4.Box.*;
import by.tms.homeWork4.Shapes.Ball;
import by.tms.homeWork4.Shapes.Cylinder;
import by.tms.homeWork4.Shapes.Pyramid;

public class Main {
    public static void main(String[] args) {

        //Создаем объекты фигур
        Cylinder cylinder = new Cylinder(10, 10);
        System.out.println("Предмет 1 - Цилиндр объемом :"+cylinder.volume);

        Pyramid pyramid = new Pyramid(300, 20);
        System.out.println("Предмет 2 - Пирамида объемом :"+pyramid.volume);

        Ball ball = new Ball(10);
        System.out.println("Предмет 3 - Шар объемом :"+ball.volume);

        //Создаем объекты коробок
        OctagonalBox box6 = new OctagonalBox(20, 50);
        System.out.println("Объем шестиугольной коробки :"+box6.volume);
        HexagonalBox box8 = new HexagonalBox(50, 20);
        System.out.println("Объем восьмиугольной коробки :"+box8.volume);
        TriangularBox box3 = new TriangularBox(20, 50);
        System.out.println("Объем треугольной коробки :"+box3.volume);
        QuadrangularBox box4 = new QuadrangularBox(40, 40, 70);
        System.out.println("Объем четырехугольной коробки :"+box4.volume);

        //метод заполняет коробку тремя фигурами по очереди пока помещается хотябы одна из них
        box8.fillTheBox(cylinder, pyramid, ball);

        //метод заполняет коробку одной выбранной фигурой пока на нее хватает место
         box6.fillWithSame(pyramid);

        //метод кладет в коробку выбранную фигуру возвращает false если не хватит места иначе true
        System.out.println(box6.add(ball));

        //метод показывает кол-во фигур в коробке
        box6.getCounter();

        box3.fillWithSame(ball);
        box4.fillWithSame(cylinder);


    }
}