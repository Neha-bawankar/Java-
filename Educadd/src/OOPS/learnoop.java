package OOPS;

public class learnoop {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Leo";
        d1.age = 12;
        d1.bark();


        Dog d2 = new Dog();
        d2.name = "Pupppy";
        d2.walk();



    }


}
class Dog{
    String name;

    int age;
    String color;

    void bark(){

        System.out.println(name + " is barking");
        System.out.println(name + "age is " + age);
    }
    void walk(){
        System.out.println(name + " is walikng");
    }

}