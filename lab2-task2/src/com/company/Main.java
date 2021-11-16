package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
     PriorityQueue<String> queue= new PriorityQueue<String>();
     queue.offer("George");
        queue.offer("Jim");
        queue.offer("John");
        queue.offer("Blake");
        queue.offer("Kevin");
        queue.offer("Michael");

        PriorityQueue<String> queue1= new PriorityQueue<String>();
        queue1.offer("George");
        queue1.offer("Katie");
        queue1.offer("Kevin");
        queue1.offer("Michelle");
        queue1.offer("Ryan");

        System.out.println("Queue1: " + queue);
        System.out.println("Queue2: " + queue1);
        System.out.println("Their union "+union(queue,queue1));
        System.out.println("Their diffrence "+diffrence(queue,queue1));
        System.out.println("Their diffrence "+intersection(queue,queue1));


    }
    private static  PriorityQueue<String> union(PriorityQueue<String> queue, PriorityQueue<String> queue1) {
        PriorityQueue<String> union = new PriorityQueue<>(queue);
        union.addAll(queue1);
        return union;
    }
    private static  PriorityQueue<String> diffrence( PriorityQueue<String> queue, PriorityQueue<String> queue1) {
        PriorityQueue<String> difference = new PriorityQueue<>(queue);
        difference.removeAll(queue1);
        return difference;
    }
    private static  PriorityQueue<String> intersection( PriorityQueue<String> queue, PriorityQueue<String> queue1) {
        PriorityQueue<String> intersection = new PriorityQueue<>(queue);
        intersection.retainAll(queue1);
        return intersection;
    }
    }

