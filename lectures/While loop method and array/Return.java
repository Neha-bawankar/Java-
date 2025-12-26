import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        greet();

        System.out.println("please enter the number: ");
        int first = input.nextInt();
        System.out.println("please enter the number: ");
        int second = input.nextInt();

        int sum = first +second;
        System.out.println("sum fo the number is:" + sum);*/
        greet();
        int first = readnumber();
        int second = readnumber();

        int sum = first+second;
        System.out.println("sum of the number is:"+ sum);
    }
    public static int readnumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number = input.nextInt();
        return number;
    }




    public static void greet() {
        System.out.println("welcome to claculator");

    }
}
