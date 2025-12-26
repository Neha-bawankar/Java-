import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to simple Interest Calculator\n");
        System.out.println("Please enter your principal amount Rs");

        int principal = input.nextInt();
        System.out.println("Tell me your rate of interest");

        float rate = input.nextFloat();
        System.out.println("Tell me for how many years are you borrowing money ");

        float years = input.nextFloat();

        float interest = (principal * rate* years)/100;
        System.out.println("\n\n your simple interest is Rs " + interest);
    }
}
