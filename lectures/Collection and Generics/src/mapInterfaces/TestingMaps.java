package mapInterfaces;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Neha", 23);
        map.put("Shubham", 27);
        map.put("Apple", 12);
        map.put("Orange", 10);
        map.put("pineapple",1);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("Shubham"));
        System.out.println(map.containsKey("Neha"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.remove("Neha", 23));
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.printf("%s: %s\n", key, map.get(key));
        }
    }
}
