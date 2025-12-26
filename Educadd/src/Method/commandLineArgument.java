package Method;

public class commandLineArgument {
    public static void main(String[] args) {
        sum(10, 2);

    }
    static int sum(int a, int b){
        int add = a+b;
        System.out.println(add);
        return add;
    }
}
