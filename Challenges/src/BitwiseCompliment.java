import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of not /compliment operator");
        System.out.println("Please enter your number");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("your result is:" + result);
    }
}
