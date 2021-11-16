package com.company;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.offer("George");
        queue1.offer("Jim");
        queue1.offer("John");
        queue1.offer("Blake");
        queue1.offer("Kevin");
        queue1.offer("Michael");

        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.offer("George");
        queue2.offer("Katie");
        queue2.offer("Kevin");
        queue2.offer("Michelle");
        queue2.offer("Ryan");

        PriorityQueue<String> union = new PriorityQueue<>(queue1);
        union.addAll(new HashSet<>(queue2));
        System.out.println("Union: "+union);

        PriorityQueue<String> difference = new PriorityQueue<>(queue1);
        difference.removeAll(new HashSet<>(queue2));
        System.out.println("Difference: "+difference);

        PriorityQueue<String> intersection = new PriorityQueue<>(queue1);
        intersection.retainAll(new HashSet<>(queue2));
        System.out.println("Intersection: "+intersection);


        }
    }
