package com.company;
import java.util.*;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<String> queue1=new PriorityQueue <String>();
        queue1.offer("George");
        queue1.offer("Jim");
        queue1.offer("Jhon");
        queue1.offer("Blake");
        queue1.offer("Kevin");
        queue1.offer("Michael");
        PriorityQueue<String> queue2=new PriorityQueue<String>();
        queue2.offer("George");
        queue2.offer("Katie");
        queue2.offer("Kevin");
        queue2.offer("Michelle");
        queue2.offer("Ryan");
        System.out.println("Priority Queue 1 "+queue1);
        System.out.println("Priority Queue 2 "+queue2);
        System.out.println("union is "+ union(queue1,queue2));
        System.out.println("difference is "+difference(queue1,queue2));
        System.out.println("intersection is "+intersection(queue1,queue2));



    }
    //union
    public static PriorityQueue<String> union(PriorityQueue<String> queue1, PriorityQueue<String> queue2){
        PriorityQueue<String> queue3 = new PriorityQueue<>();
        queue3.addAll(queue1);
        queue3.addAll(queue2);
        return queue3;
    }
    //difference
    public static PriorityQueue<String> difference(PriorityQueue<String> queue1, PriorityQueue<String> intersectionQueue) {
        PriorityQueue<String> queue3 = new PriorityQueue<>(queue1);
        queue3.removeAll(new HashSet<>(intersectionQueue));
        return queue3;
    }
    //intersection
    public static PriorityQueue<String> intersection(PriorityQueue<String> queue1, PriorityQueue<String> queue2) {
        PriorityQueue<String> queue3 = new PriorityQueue<>(queue1);
        queue3.retainAll(new HashSet<>(queue2));
        return queue3;
    }

}
