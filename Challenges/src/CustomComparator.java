import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Lion", "Elephant", "Ant", "Monkey");
        System.out.println(list);
      sortInDescending(list);
        System.out.println(list);
    }
    public static void sortInDescending(List<String> stringList){
           Collections.sort(stringList);
          // Collections.reverse(stringList);

    }
}
