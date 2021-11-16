package com.company;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {

        PriorityQueue<String> pq1 = new PriorityQueue<>();

        pq1.add("George");
        pq1.add("Jim");
        pq1.add("John");
        pq1.add("Blake");
        pq1.add("Kevin");
        pq1.add("Michael");

        System.out.println(pq1);

        PriorityQueue<String> pq2 = new PriorityQueue<>();

        pq2.add("George");
        pq2.add("Katie");
        pq2.add("Kevin");
        pq2.add("Michelle");
        pq2.add("Ryan");

        System.out.println(pq2);
    }
}
