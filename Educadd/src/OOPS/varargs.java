package OOPS;

// varargs = allow a method to accept a varying # of argument makes method are flexible
public class varargs {
    public static void main(String[] args) {


        System.out.println(add(1,2,4));
    }

    /*static void add(int... numbers){
        System.out.println(numbers);
    }*/

    static  int add(int... numbers){
          int sum =0;
          for(int number : numbers){
              sum += number;

          }
          return sum;

    }
}
