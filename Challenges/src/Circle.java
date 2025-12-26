import java.util.Scanner;

public class Circle {
    double radiusInMm ;
    Circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
     return  2* radiusInMm * Math.PI;
    }
    double getArea(){
        return 2 * radiusInMm * Math.PI;
    }

    @Override
    public String toString() {
     return "Cirlce props: Radius is mn : " + radiusInMm
             + ", Circumference is mm:" +getCircumference()
             +", Area of mm : "+ getArea();
    }

    public static void main(String[] args) {
                   Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle\n ");
        System.out.println("Please enter your radius");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}
