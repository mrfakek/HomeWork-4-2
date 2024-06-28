package by.tms.homeWork4.Box;

import by.tms.homeWork4.Shapes.Ball;
import by.tms.homeWork4.Shapes.Cylinder;
import by.tms.homeWork4.Shapes.Pyramid;
import by.tms.homeWork4.Shapes.Shape;

public class Box extends Shape{
    public double square;
    final double length;
   final double height;
   int countCylinder =0;
   int countPyramid =0;
   int countBall =0;
     Box (double _length, double _height) {
         length = _length;
         height = _height;
     }
     private void counter (Shape shape){
         switch (shape.name){
             case "Цилиндр": countCylinder++; break;
             case "Пирамида": countPyramid++; break;
             case "Шар": countBall++; break;
         }
     }
    public void getCounter (){
        System.out.println("Количество цилиндров в коробке - "+countCylinder);
        System.out.println("Количество пирамид в коробке - "+countPyramid);
        System.out.println("Количество шаров в коробке - "+countBall);
    }
    public boolean add (Shape shape) {
         if (volume - shape.volume > 0) {
            volume -= shape.volume;
            counter(shape);
            return true;
        } else {
            return false;
        }
    }
         public void fillTheBox (Shape shape1, Shape shape2, Shape shape3){
         int flag;
         while (volume>0) {
             flag=0;
            if (volume - shape1.volume > 0){
                volume -= shape1.volume;
                countCylinder++;
            }
            else flag ++;
            if(volume - shape2.volume > 0) {
                volume -= shape2.volume;
                countPyramid++;
            }
            else flag ++;
            if(volume - shape3.volume > 0) {
                volume -= shape3.volume;
                countBall++;
            }
            else flag ++;
            if (flag==3){
                  System.out.println(false);
                  getCounter();
                  System.out.println("Объем = "+volume+" - Осталось не занято");
                  return;
            }
         }
        }
    public void fillWithSame (Shape shape){
        int count=0;
        while (add(shape)) {
            counter(shape);
        }
        getCounter();
        System.out.println("Объем = "+volume+" - Осталось не занято");
    }
     }

