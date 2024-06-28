package by.tms.homeWork4.Shapes;

public class Pyramid extends Shape{
   final double squareAtBase;
   final double height;
   public Pyramid(double _square, double _height){
      squareAtBase =_square;
      height=_height;
      volume=1/3d* squareAtBase * height;
      name="Пирамида";
   }
}
