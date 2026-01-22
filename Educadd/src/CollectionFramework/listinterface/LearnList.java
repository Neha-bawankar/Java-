package CollectionFramework.listinterface;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class LearnList{

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);


        //using reflation
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData =(Object[]) field.get(list);
        System.out.println("ArrayList capacity: "+ elementData.length);











































/*
   list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(9);
     System.out.println(list);

     list.add(3, 20);

     System.out.println(list);

     list.set(3, 40);
     System.out.println(list);

     System.out.println(  list.size());
     System.out.println(list.get(2));
/*
     // for loop iterator
     for(int i =0; i <= list.size(); i++){
      System.out.println(list.get(i));
     }

     // for each
     for(int m : list){
      System.out.println(list.get(m));
     }


        System.out.println(list.contains(40));

        System.out.println(list.isEmpty());
        System.out.println(list.clone());


        //list.clear();

        list.remove(4);
        list.removeFirst();
        list.removeLast();




        System.out.println(list);
        // add element
       list.add("Apple");
        list.add("Banana");
        list.add("Mango");


        //add with index
        list.add(2, "Cherry");

       // addAll - add one list to another list
        List<String> list1 = new ArrayList<>();
        list1.add("Pineapple");
        list.addAll(list1);

        //addall  - with index
        list.addAll(2, list1);
        System.out.println(list);

        //get
        System.out.println("Element at index3: " + list.get(3));

        //set
         list.set(0, "Green chilli");
        System.out.println(list);

        //remove - remove element at given index
        list.remove(1);
        System.out.println(list);

        //remove - first occurrence
        list.remove("Mango");
        System.out.println(list);

        //contains - check if element is exits
        list.contains("Cherry");
        System.out.println(list);


        //indexof - return first index of element

        System.out.println( list.indexOf("Pineapple"));

        //lastindexof - return last index of element
        System.out.println(list.lastIndexOf("Pineapple"));

        //size - return number of element
        System.out.println(list.size());


        //isempty() - check if list is empty
        System.out.println(list.isEmpty());

        //subList - create a view of part of list
        List<String> list2 = list.subList(1,3);
        System.out.println(list2);


        //iterator() - traverse list one direction
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }

        //toArray() -
        Object[] arr = list.toArray();
        System.out.println(arr);

        //clear
        list.clear();
        System.out.println(list);


*/







    }


}
