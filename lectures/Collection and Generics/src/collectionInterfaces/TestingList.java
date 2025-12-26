package collectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        //Adding the element
        strList.add("Neha");
        strList.add("Bawankar");
        strList.add(1, "Narayan");
        //Removing the element
        strList.remove(0);

        if(strList.contains("Bawankar")){
            System.out.println(strList.indexOf("Bawankar"));
        }


        for(int i =0; i< strList.size(); i++){
            System.out.println(strList.get(i));
        }

    }
}
