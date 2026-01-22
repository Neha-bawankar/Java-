package CollectionFramework.listinterface;

import OOPS.inheritence.Inheri;

import java.util.Stack;
/* stack follow last in first out principle, where the last element added is the first one to be removed.
   stack is a subclass of vector , which means it inherit all the features of a dynamic array but is constrained by the stack lifo nature.
 */
public class stacc {
    public static void main(String[] args) {
         //stack - LIFO - last in first out principle
        //push - add element at top
        // pop - remove element from top
        //peek - view top without removing


        Stack<Integer> stack = new Stack<>();

        // add element in the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);

        //remove element
        Integer removeElement = stack.pop();
        System.out.println(stack);

        //view of the stack
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

       //stack can implement vector method because it is subclass of vector
        int search = stack.search(3);
        System.out.println(search);  // search is 1- based index.










    }
}
