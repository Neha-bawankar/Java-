package in.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static  void a (){
            b();
    }

    private static  void b (){
       c();
    }
    private static  void c (){
            Scanner input = new Scanner(System.in);
            System.out.println("welcome to division calculator");
            System.out.println("please enter your two number");

            int first= input.nextInt();
            int second = input.nextInt();

            try{
                int[] a = new int[5];
                System.out.printf("result is %d", a[6]);
                a[6]= first/second;
                System.out.printf("result is %d", a[6]);

            } catch(ArithmeticException exception){
                System.out.printf("%S, enter valid values", exception.getMessage());
            }
            catch(Throwable th){
                System.out.println("General exception");
                throw  th;
            }

    }

}
