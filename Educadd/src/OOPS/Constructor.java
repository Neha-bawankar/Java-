package OOPS;

public class Constructor {
    public static void main(String[] args) {
      Complex1 num1= new Complex1();
      Complex1 num2 = new Complex1(5, 7);
      num1.print();
      num2.print();
        System.out.println("Adding two number");
        num1.add(num2);
    }
}

class Complex1{
    int a, b;
    void print(){
        System.out.println(a+ " + "+ b+ " i");
    }

    public Complex1(){    // default constructor
        a =0;
        b =0;
    }

    public Complex1(int real, int imaginary){  //parameterized constructor
        a = real;
        b = imaginary;
    }

    Complex1 add(Complex1 num2){
        Complex1 newNum = new Complex1(a + num2.a , b + num2.b);
        return  newNum;
    }


}
