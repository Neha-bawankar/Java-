package OOPS.encapsulationandpackages.Encapsulation;

/* Access modifier - access modifier are used to set the accessibility of classes, interface, method, variable and setter the method

 */
public class accessModifier {
    //private - accessible with the same class - used for data hiding
     private int a  =10;

     //no keyword accessible within the same package only
      int b  =20;

     //protected - accessible within the same package but outside package only through inheritance
     protected  int c  = 30;

     //public - accessible from anywhere
    public  int d  = 35;


    public  void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }



    public static void main(String[] args) {

    }
}


