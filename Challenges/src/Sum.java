import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int Firstnum = input.nextInt();
        System.out.println("enter your second number");
        int secondnum = input.nextInt();
        int sum = Firstnum + secondnum;
        System.out.println("Sum of your number:"+ sum);
    }
}
