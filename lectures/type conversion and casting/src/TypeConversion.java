public class TypeConversion {
    public static void main(String[] args) {

        float myfloat = 5;
        System.out.println(myfloat);

        int myInt = (int) 5.45f;
        System.out.println(myInt);

         byte b = 127;
         int a = 257;

// this is called type conversion
         a = b;
        System.out.println(a);
// type casting
        a = (byte) b;
        System.out.println(a);

    }
}
