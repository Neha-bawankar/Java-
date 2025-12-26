import java.sql.SQLOutput;
import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absoulte Ternary");
        System.out.println("Please enter the number");
        int num = input.nextInt();

        int result = num>=0 ? num : -num ;
        System.out.println("Your number is "+ result);
    }
}
