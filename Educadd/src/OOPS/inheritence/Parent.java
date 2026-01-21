package OOPS.inheritence;

//final  - you cannot change it
public class Parent {
    final int x  = 10;
    void change(){
       // x = 28;  // error  - final variable can not changed
    }
    final void show(){
        System.out.println("Parent show");
    }
}

class child extends Parent{
   /* void show(){
         //  final method can not change
    }*/
}


//isinstanceof - is check is this object created from this class

class text{

}
class msg extends  text{
    public static void main(String[] args) {
        msg m = new msg();
        System.out.println(m instanceof msg);
        System.out.println(m instanceof  text);
    }
}