import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(3);
        numList.add(-76);

        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);







    }
}
