package com.company;

import java.util.*;


public class priorityQueues {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        HashSet<String> set3 = new HashSet<>();

        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        System.out.println("List one\t"+set1);
        System.out.println("List two\t"+set2);
        set3.addAll(set1);
        set3.addAll(set2);

        PriorityQueue<String> q1 = new PriorityQueue<>(set1);
        PriorityQueue<String> q2 = new PriorityQueue<>(set2);
        PriorityQueue<String> q3 = new PriorityQueue<>();
        PriorityQueue<String> q4 = new PriorityQueue<>();

        PriorityQueue<String> set = new PriorityQueue<>(set3);
        System.out.println("union\t" + set);

        q3.addAll(q1);
        q3.removeAll(q2);
        q2.removeAll(q1);
        q4.addAll(q3);
        q4.addAll(q2);
        System.out.println("difference\t" + q4);
        set1.retainAll(set2);
        System.out.println("intersection\t"+set1);
    }
}
