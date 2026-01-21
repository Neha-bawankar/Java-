package OOPS.inheritence;



//HIERARCHICAL INHERITANCE - one parent and many child
//constructor invoking - always parent constructor called first and then child constructor
public class Vehicle {
      void start(){

          System.out.println("Vehicle is starting");
      }

  Vehicle(){

          System.out.println("Vehicle constructor");
      }
}
class car extends Vehicle{
    car(){

        System.out.println("Car constructor");
    }
   // without super class if we write same method for parent and child class it override the method - method overriding
    //why because object is car and jvm check object not reference
    void start(){
        super.start();   // calling first parent method
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        car obj = new car();
        obj.start();

    }

}
class Bus extends Vehicle{

}