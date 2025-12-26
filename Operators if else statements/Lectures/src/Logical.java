import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Are you female? (true/false)");

        boolean isFemale = input.nextBoolean();
        if(age<5){
            System.out.println("You got 75% Discount");
        }else if(isFemale){
            System.out.println("You got 50% Discount");
        }else if(age>60 && !isFemale){
            System.out.println("You got 20% Discount");
        }else{
            System.out.println("You got no Discount");
        }


// AND  - &&
        /* T  T = T
           T  F = F
           F  T = F
           F  F = F

         */

        // OR - ||
        /*  T  T = T
            T  F = T
            F  T = T
            F  T = F
         */

        // NOT = !
      /*
      T = F
      F = T
       */

    }
}
