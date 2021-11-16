package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        PriorityQueue < String > names1 = new PriorityQueue < > (Arrays.asList(
                "George", "Jim", "John", "Blake", "Kevin", "Michael"));

        PriorityQueue < String > names2 = new PriorityQueue < > (Arrays.asList(
                "George", "Katie", "Kevin", "Michelle", "Ryan"));



        // Display the two sets and union, difference, and intersection
        System.out.println("Set 1: " + names1);
        System.out.println("Set 2: " + names2);
        System.out.println("Union: " + union(names1, names2));
        System.out.println("Difference: " + findDifference(names1, names2));
        System.out.println("Intersection: " + findIntersection(names1, names2));

        // Initiate hashSet
        HashSet<String> hashSet = new HashSet<>();





        List<String> list = new ArrayList<String>();
        int counnter = 0;
        try {
            File myObj = new File("D:\\Programming\\java\\randomWords.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String data = myReader.next();
                list.add(data);
                if (!(data.equalsIgnoreCase("a"))) {
                    counnter++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            char[] validate = word.toCharArray();
            for (char v : validate) {
                if ((Character.isDigit(v))) {
                    System.out.println(v);
                    list.remove(i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);

    }

    public static <E> PriorityQueue<E> union(PriorityQueue<E> firstQueue, PriorityQueue<E> secondQueue) {
        PriorityQueue<E> union = new PriorityQueue<>(firstQueue);
        union.addAll(secondQueue);
        return union;
    }

    /** Calculating difference. */
    public static <E> PriorityQueue <E> findDifference(PriorityQueue<E> firstQueue, PriorityQueue<E> secondQueue){
        PriorityQueue<E> difference = new PriorityQueue<>(firstQueue);
        difference.removeAll(secondQueue);
        return  difference;
    }

    /** Calculating Intersection. */
    public static <E> PriorityQueue <E> findIntersection(PriorityQueue<E> firstQueue, PriorityQueue<E> secondQueue) {
        PriorityQueue<E> intersection = new PriorityQueue<>(firstQueue);
        intersection.retainAll(secondQueue);
        return intersection;
    }
    }



