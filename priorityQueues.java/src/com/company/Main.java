package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        PriorityQueue<String> queueOne = new PriorityQueue<>(Arrays.asList());
        queueOne.offer("George");
        queueOne.offer("Jim");
        queueOne.offer("John");
        queueOne.offer("Blake");
        queueOne.offer("Kevin");
        queueOne.offer("Michael");

        PriorityQueue<String> queueTow = new PriorityQueue<>(Arrays.asList());
        queueTow.offer("George");
        queueTow.offer("Katie");
        queueTow.offer("Kevin");
        queueTow.offer("Michelle");
        queueTow.offer("Ryan");


        System.out.println("queueOne => " + queueOne);
        System.out.println("queueTow => " + queueTow);
        System.out.println("Union => " + union(queueOne, queueTow));
        System.out.println("Difference => " + difference(queueOne, queueTow));
        System.out.println("Intersection => " + intersection(queueOne, queueTow));
    }


    private static <T> PriorityQueue<T> union(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> union = new PriorityQueue<>(set1);
        union.addAll(set2);
        return union;
    }

    private static <T> PriorityQueue<T> difference(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> difference = new PriorityQueue<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    private static <T> PriorityQueue<T> intersection(
            PriorityQueue<T> set1, PriorityQueue<T> set2) {
        PriorityQueue<T> intersection = new PriorityQueue<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
