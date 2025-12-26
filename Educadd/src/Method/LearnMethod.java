package Method;

public class LearnMethod {
    public static void main(String[] args) {
        message("I am learning something"); // argument
        sum(5, 9);// calling method
        average(9, 4); //calling method

    }


    // creating method
    public static void sum(int a, int b){ // passing parameter by value
        System.out.println(a+b);

    }

    public static String message(String msg){
        System.out.println("Hello");
        System.out.println(msg);
        System.out.println("Thank you");

        return msg;
    }


    public static int average(int a, int b){
        int avg = (a+b) /2;
        System.out.println(avg);

        return avg;

    }



}
