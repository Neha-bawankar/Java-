package In.NehaBawankar;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "MG";
        System.out.println(car);
         Car newCar = new Car("black", "bmw", 1, 5000 );
        System.out.println(newCar);
    }
}
