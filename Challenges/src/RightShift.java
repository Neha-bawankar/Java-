import java.util.Scanner;

public class RightShift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Right Shift operator");
        System.out.println("Please enter the first number");
        int num = input.nextInt();


        int result = num>>1;
        System.out.println("result is :" + result);

    }
}
