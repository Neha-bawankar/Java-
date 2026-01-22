package CollectionFramework.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// comparator  - it is used to compare two object of same type and determine their order also
// A Comparator is an object that defines custom ordering logic for objects.
class StringLengthComparator implements Comparator<String>{

    public int compare(String o1, String o2){
      //return o1.length() - o2.length(); // ascending order
        return o2.length() - o1.length();  // descending order
    }
}
//ok
//bye
class MyComparator implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        return o1 -o2;    //ascending order
        //return o2 -o1;   // descending order
    }
}



public class learnComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(null);
        System.out.println(list);

        list.sort(new MyComparator());
        System.out.println(list);
//ex-2
        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);

        //with lambda
/*
        List<String> words1 = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words1);
*/
    }
}
