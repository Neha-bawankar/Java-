package collectionInterfaces;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Neha"));
        System.out.println(names.add("Narayan"));
        System.out.println(names.add("Coding"));

        for(String s : names){
            System.out.println(s);
        }
        System.out.println(names.add("Neha"));
        System.out.println(names.contains("Coding"));
        System.out.println(names.remove("Neha"));


        for(String s : names){
            System.out.println(s);
        }
        System.out.println(names.isEmpty());
    }
}
