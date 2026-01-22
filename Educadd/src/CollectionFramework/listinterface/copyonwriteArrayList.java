package CollectionFramework.listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/* copy on write means  that whenever a write program
like adding or removing an element
instead of directly modifying the existing list
a new copy of the list is created , and the modification is applied to that copy
This ensure that other threads reading the list while it being modified are unaffected.


read operation - fast and direct, since they happen on a stable list without interference from modification.
write operation - a new copy of the list is created for every modification.



 */
public class copyonwriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();



        //List<String> shoppingList= new ArrayList<>();
        List<String>shoppingList  = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Intial shopping list: "+ shoppingList);

        for(String item: shoppingList){  // with for each loop i am reading the list
            System.out.println(item);
            //Try to modify the list while reading
            if(item.equals("Eggs")){  // if my condition is match with egg in list you can add butter
                shoppingList.add("Butt" +
                        "er");
                System.out.println("Added butter while reading");
            }

        }
        System.out.println("updated shopping list: " + shoppingList);

    }
}
