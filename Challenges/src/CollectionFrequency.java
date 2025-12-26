import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,8,6,8,9,1,2, 9, 9,1,7,2);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 2));
        System.out.println(Collections.frequency(list, 4));
        System.out.println(Collections.frequency(list, 6));
        System.out.println(Collections.frequency(list, 7));
        System.out.println(Collections.frequency(list, 8));
        System.out.println(Collections.frequency(list, 9));

    }
}
