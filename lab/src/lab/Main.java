package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Create a text file called randomWords.txt and a Java file called alphabeticalWords.java.
//        Inside, write a program that reads words from the text file and displays all the words (duplicates allowed)
//        in ascending alphabetical order. The words must start with a letter.

        File file = new File("/Users/shrooqsaleh/Desktop/tuwaiq/Lab code/Week6/W07D03-Collections-Lab/lab/src/lab/randomWords.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

//        Create a Java file called priorityQueues.java.
//        Inside, create two priority queues, {"George", "Jim", "John", "Blake", "Kevin", "Michael"}
//        and {"George", "Katie", "Kevin", "Michelle", "Ryan"}.
        PriorityQueue<String> q1 = new PriorityQueue<String>();
        q1.offer("George");
        q1.offer("Jim");
        q1.offer("John");
        q1.offer("Blake");
        q1.offer("Kevin");
        q1.offer("Michael");

        PriorityQueue<String> q2 = new PriorityQueue<String>();
        q2.offer("George");
        q2.offer("Katie");
        q2.offer("Kevin");
        q2.offer("Michelle");
        q2.offer("Ryan");

        System.out.println("PriorityQueue1 "+q1);
        System.out.println("PriorityQueue2 "+q2);
//      Find their union, difference, and intersection.
//      Union section:
        System.out.println(q1.contains(q2));
        PriorityQueue<String> union = new PriorityQueue<String>(q1);
        union.addAll(q2);
//      difference
        PriorityQueue<String> difference = new PriorityQueue<String>(q1);
        difference.removeAll(q2);

        PriorityQueue<String> intersection = new PriorityQueue<String>(q1);
        intersection.retainAll(q2);

        System.out.println("Union: "+ union);
        System.out.println("Difference"+ difference);
        System.out.println("Intersection"+ intersection);


    }

}
