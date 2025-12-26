package In.Coding.overloadingchalllenges;

public class Calculator {
    public int add(int first, int second){
        return first + second;
    }

    public int add(int first, int second, int third){
        return  first +  second +  third;
    }

    public double add(double first , double second){
        return first + second;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(4,6, 8));
        System.out.println(calc.add(5.2,6.2));


    }

}
