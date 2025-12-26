package Knowledgepage;

import gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
    Car car = new Car("green", "maruti", 3, 10000);
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }

}
