package Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
      //  Vehicle v = new Vehicle();

        //Vehicle vCar = new Car();
        Plane p = new Plane();
       // castTest(v);
        //castTest(c);
      //  castTest(p);

        c.start();
        p.start();
    }
    private static void castTest(Vehicle veh){
            veh.start();
    }
}
