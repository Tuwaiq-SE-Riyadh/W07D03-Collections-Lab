package com.company;
import java.util.*;
public class priorityQueues {
    private static Object PriorityQueue;

    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        PriorityQueue<String> queue3 = new PriorityQueue<>();
        PriorityQueue<String> queue4 = new PriorityQueue<>();
        PriorityQueue<String> queue5 = new PriorityQueue<>();
        queue1.offer("George");
        queue1.offer("Jim");
        queue1.offer("John");
        queue1.offer("Blake");
        queue1.offer("Kevin");
        queue1.offer("Michael");
        System.out.println("queue1" + queue1);


        queue2.offer("George");
        queue2.offer("Katie");
        queue2.offer("Kevin");
        queue2.offer("Michelle");
        queue2.offer("Ryan");
        System.out.println("queue2" + queue2);
        queue3.offer("George");
        queue3.offer("Jim");
        queue3.offer("John");
        queue3.offer("Blake");
        queue3.offer("Kevin");
        queue3.offer("Blake");
        queue3.offer("Michael");
        queue3.offer("Katie");
        queue3.offer("Ryan");
        System.out.println("union" + queue3);
        queue1.retainAll(queue2);

        System.out.println("intersection" + queue1);


        queue4.addAll(queue1);
//        System.out.println("difference\t" + queue4);
       queue4.removeAll(queue2);
       queue2.removeAll(queue1);

//        System.out.println("difference\t" + queue2);
        queue4.addAll(queue5);
        queue4.addAll(queue2);

        System.out.println("difference\t" + queue4);







    }
}