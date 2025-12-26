public class Car {
    int numOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int numOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.numOfWheels = numOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120,
                "swift", "1245f", "Maruti");
        System.out.println(swift.toString());
    }



}
