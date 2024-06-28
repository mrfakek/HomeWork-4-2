package by.tms.homeWork4.Shapes;

import java.awt.*;

public class Ball extends SolidOfRevolution {

          public  Ball (double _radius) {
                super(_radius);
                volume = 4 / 3d * Pi * (radius * radius * radius);
                name="Шар";
            }

}
