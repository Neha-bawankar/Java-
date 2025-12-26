package collectionInterfaces;


import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
         Queue<Integer> queue = new LinkedList<>() ;
         queue.add(1);
         queue.offer(2);

        for(Integer i : queue){
        System.out.printf("%d ", i);
}

    }
}
