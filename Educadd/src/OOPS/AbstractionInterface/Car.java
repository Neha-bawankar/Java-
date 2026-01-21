package OOPS.AbstractionInterface;

/*  The abstract class in java ca not be instantiated(we can not create objects of abstract classes).
what it this thing only i want.
*/
abstract class Car {

   abstract  void start();

   public static void main(String[] args) {

         Car car = new Car() {
            @Override
            void start() {
               System.out.println("car is starting");
            }
         };
         car.start();
      }




}
class PetrolCar extends Car{
     void start(){
        System.out.println("Petrol car is starting");
     }
}

class EngineCar extends  Car{
   void start(){
      System.out.println("Engine car is starting");
   }
}

