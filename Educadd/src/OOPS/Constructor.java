package OOPS;

public class Constructor {
    public static void main(String[] args) {
      Complex1 num1= new Complex1();  // creating object
      Complex1 num2 = new Complex1(5, 7);
      num1.print();
      num2.print();
        System.out.println("Adding two number");
        num1.add(num2);
        num1.print();
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

  public Complex1(int a, int b){  //parameterized constructor
       this.a = a;
        this.b = b;
    }

    Complex1 add(Complex1 num2){
        Complex1 newNum = new Complex1(a + num2.a , b + num2.b);
        return  newNum;
    }


}
