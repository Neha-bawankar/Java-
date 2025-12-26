package In.Coding.utils;

import In.Coding.geometry.Circle;
import In.Coding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(circle.radius, 2);
        double reactArea = rectangle.breadth * rectangle.length;

        System.out.printf("Area of the circle is %f ,area of the rectangle is: %f ", cirArea, reactArea);


    }


}


