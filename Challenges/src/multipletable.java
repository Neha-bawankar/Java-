import java.util.Scanner;

public class multipletable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to multiplication world");
        System.out.println("please enter your number");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num){
            int i= 1;
            while (i<=10){
                System.out.println(num + " x " + i + " = "+ (num*i));
                i++;
            }
    }
}
