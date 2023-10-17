package ilia.Tasks;

import java.util.LinkedList;
import java.util.Queue;

public class Task3_Queue {
    public static void main(String[] args)
    {
        Queue<String> words = new LinkedList<>();
        words.add("pizza");
        words.add("sushi");
        words.add("chicken");
        String first = words.poll();
        System.out.println("First element: " + first);

        boolean isEmpty = words.isEmpty();
        System.out.println("Queue is Empty? " + isEmpty);
    }
}
