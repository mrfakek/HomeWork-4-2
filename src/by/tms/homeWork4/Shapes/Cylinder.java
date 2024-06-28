package by.tms.homeWork4.Shapes;

public class Cylinder extends SolidOfRevolution{
final double height;
    public Cylinder(double _height, double _radius) {
    super(_radius);
    height = _height;
    volume = Pi*radius*radius*height;
        name="Цилиндр";
}

}
