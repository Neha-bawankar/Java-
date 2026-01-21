package OOPS.inheritence;


//single inheritance  - one parent and one child class

public class A {
    void show(){  // method of parent class
        System.out.println("A");
    }
}

class B extends  A{

    void showB(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        C obj1 = new C();
        obj1.show(); // parent class
        obj1.showB();  // child class
    }
}

//multilevel inheritance  - parent - child - grandchild



class C extends  B {  // grandchild class

}