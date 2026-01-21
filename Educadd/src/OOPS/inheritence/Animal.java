package OOPS.inheritence;


//inheritence - inherit the property of parent , one class get properties and behavoiur of another class automatically
//parent class - gives thing
// child class - receives thing



class Animal{          // parent class
    int age  =5;
    void eat(){
        System.out.println("Eating");
    }

}

class Dog extends Animal{   // child class
    // child only get variable and method from parent class
    // not constructor and private member

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.age);
        d.eat();
    }
}
class Cat extends  Animal{

}


//Is- A relationship - inheritence is used only when is a relationship exits
//ex - dog is a animal but (car is a engine is not)

/*class car{
    Engine engine;  //has a relationship

}*/