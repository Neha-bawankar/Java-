import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to compound interest calculator\n");
        System.out.println("Please enter your principal amount rs");
        int principle = input.nextInt();
        System.out.println(" Now, Tell me your rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("now, tell me how  many years are you ");
        float years = input.nextFloat();

        double compoundInterest = principle* Math.pow((1+ rate /100), years);
        System.out.println("your Compound interest is Rs" + compoundInterest);


    }
}
