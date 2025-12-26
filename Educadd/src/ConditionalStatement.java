import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        //if statement

        Scanner sc = new Scanner(System.in);
  /*      System.out.println("ENTER YOUR AGE");
        int age = sc.nextInt();

        if(age >18){
            System.out.println("I can drive a car");
        }
        else{
            System.out.println("I can ride cycle");
        }

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        if(marks >=90){
            System.out.println("A");
        }else if(marks >70 && marks <90){
            System.out.println("B");

        }else if(marks >50 && marks <70){
            System.out.println("c");
        }else{
            System.out.println("Fail");
        }


        if(true){
            System.out.println("Welcome ");
        }
*/
        System.out.println("show me days");
        int day = sc.nextInt();


        switch(day){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Invalid input");
            }
        }
   // nested if
  int a = 30;
        int b = 20;

        if(a == 80){
            if(b ==20){
                System.out.println(a+b);
            }
        }


    }
}
