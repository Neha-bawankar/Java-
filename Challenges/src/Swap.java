import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("welcome to swapping\n");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of A:");
        int a = input.nextInt();
        System.out.println("enter the value of B:");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("value of A is :" + a);
        System.out.println("value of B is :" + b);
        System.out.println("Swapping is done");
    }
}
