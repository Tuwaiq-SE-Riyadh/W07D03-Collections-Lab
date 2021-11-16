package com.company;

import java.util.HashSet;
import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {
        PriorityQueue<String> pQueue1 = new PriorityQueue<String>();

        pQueue1.add("George");
        pQueue1.add("Jim");
        pQueue1.add("John");
        pQueue1.add("Blake");
        pQueue1.add("Kevin");
        pQueue1.add("Michael");

        PriorityQueue<String> pQueue2 = new PriorityQueue<String>();

        pQueue2.add("George");
        pQueue2.add("Katie");
        pQueue2.add("Kevin");
        pQueue2.add("Michelle");
        pQueue2.add("Ryan");

        HashSet<String>set = new HashSet<>();
        set.addAll(pQueue1);
        set.addAll(pQueue2);

        PriorityQueue<String> union = new PriorityQueue<String>(set);
        System.out.println("Union queue: "+union);

        PriorityQueue<String>  difference = new PriorityQueue<String>();

        for (String element : pQueue1){
            if(!pQueue2.contains(element))
            difference.add(element);
        }
        for (String element : pQueue2){
            if(!pQueue1.contains(element))
                difference.add(element);
        }
        System.out.println("Difference queue: "+difference);

        PriorityQueue<String>  intersection = new PriorityQueue<String>();

        for (String element : pQueue1){
            if(pQueue2.contains(element))
                intersection.add(element);
        }
        System.out.println("Intersection queue: "+intersection);
    }
}
