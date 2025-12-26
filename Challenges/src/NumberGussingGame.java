import java.util.Scanner;

public class NumberGussingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game");
        int num =5 , guess;
        do{
            System.out.println("Please guess the number between games 1 and 20 ");
            guess = input.nextInt();
        }
        while(num != guess);
        System.out.println("You have successfully guessed the number");

    }
}
