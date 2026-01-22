package CollectionFramework.listinterface;


import java.util.ArrayList;
import java.util.Vector;
/* vector -  VECTOR IN JAVA is a part of the java.util package and is one of the legacy class in java implement the list interface
 It was introduced in jdk1.0 before the collection framework and its synchronized making it thread-safe. but now it part of collection framework.


 constructor of vector -
  1. vector() - create a vector with an initial capacity.
  2. vector(int initial capacity) - create a vector with a specified initial capacity
  3.  vector(int initial capacity, int capacity increment)       - create a vector with a specified initial capacity and capacity increment.
  4. vector(collection<?extends e> c) - create a vector containing the element of the specified collection
 */
public class vec {
    public static void main(String[] args) {
       Vector<Integer> vector = new Vector<>(2, 3);
       vector.add(1);
       vector.add(1);
       vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());

        // vector method
        vector.add(3);
        vector.add(4, 8);
        System.out.println( vector.get(2));
        vector.addElement(10);
        System.out.println(vector.contains(4));
        vector.remove(3);
        System.out.println(vector);






        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() ->{
            for(int i =0; i<1000; i++){
                list.add(i);
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i =0; i<1000; i++){
                list.add(i);

            }
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("size of list: " + list.size());
     }
}
