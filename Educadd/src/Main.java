//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //byte
       /* byte a =-127 ;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //SHORT
        short b = 32767;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //int
        int n = 128;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        float f = 2.4f;
        System.out.println(f);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        double d = 22.4d;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


        Boolean A= true;
        System.out.println(A);

        //Character
        char name = 'A';
        System.out.println(name);*/

// variable assign
      /*  int a =10;
        int b =20;
        // add a+b
        int c = a+b;
        System.out.println(c);

       float f =  155.5f;
       float d  = 55.5f;
       float e = f-d;
        System.out.println(e);
*/
/*
        for (int i =0; i<=127; i++){
            System.out.println((char) i);
        }*/


        //variable assign
   /*     String my_name = "Naman";
        System.out.println(my_name);
        //multiple assign
        //int x = 10, y = 20, z =30;
        int x , y, z;
        x = y =z = 20;
        //final(constant)
       final int m = 50;

        System.out.println(m);
        System.out.println(x+y +z);

*/
        //data type casting
        //Widening
        int  a = 10;
        System.out.println(a);
        double d  = a;
        System.out.println(d);

       // norrowing
        int myInt = 10;
        double myDouble = (double) myInt;
        System.out.println(myDouble);

        int maxScore= 500;
        int userscore = 423;

        double percentange = (double) userscore / maxScore *100.0;
          System.out.println(percentange);
    }
}