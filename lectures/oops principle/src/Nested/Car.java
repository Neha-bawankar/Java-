package Nested;

public class Car {

    private int noOfDoors;
    public void repair(){
        Tyre t = new Tyre();
    }


    protected  static class Tyre{

        private double width;
        private double pressure;
        private String material;


    }
}
