import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the least common multiple(lcm)");
        System.out.println("please enter your first number");
        int first = input.nextInt();
        System.out.println("please enter your second number");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("lcm of the two number is:" + lcm);
    }

        public static int lcm(int first, int second){
        int i=1;
        while(i<=second){
            int factor = first* i;
            if(factor % second ==0){
return factor;
            }
            i++;
        }
        return 0;


    }
}
