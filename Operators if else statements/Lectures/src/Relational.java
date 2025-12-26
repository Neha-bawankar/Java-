import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving license portal");
        System.out.println("Please enter you age");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are eligible for drive");
        }
        else{
            System.out.println("beta cycle chalao");
        }


        int x = 9;
        int y = 5;

        boolean result1 = x < y;
        boolean result2 = x > y;

        System.out.println(result2);


    }
}
