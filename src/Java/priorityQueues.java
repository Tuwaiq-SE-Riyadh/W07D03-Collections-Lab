package Java;
import java.util.*;
public class priorityQueues {

        public static void main(String[] args) {
            PriorityQueue<String> queue1 = new PriorityQueue<String>();
            System.out.println(" ");
            //Adding strings to queue1
            queue1.offer("George");
            queue1.offer("Jim");
            queue1.offer("John");
            queue1.offer("Blake");
            queue1.offer("Kevin");
            queue1.offer("Michael");


            PriorityQueue<String> queue2 = new PriorityQueue<String>();
            System.out.println(" ");
            //Adding strings to queue2
            queue2.offer("George");
            queue2.offer("Katie");
            queue2.offer("Kevin");
            queue2.offer("Michelle");
            queue2.offer("Ryan");

            System.out.println("After union");
            union(queue1,queue2);
            System.out.println("\nAfter intersection");
            intersection(queue1,queue2);
            System.out.println("\nAfter difference");
            difference(queue1,queue2);
        }



        public static void union(PriorityQueue<String> queue1, PriorityQueue<String> queue2){
            PriorityQueue<String> queue3 = new PriorityQueue<>();
            queue3.addAll(queue1);
            queue3.addAll(queue2);
               System.out.print(queue3);


        }

        public static void intersection(PriorityQueue<String> queue1, PriorityQueue<String> queue2) {
            PriorityQueue<String> queue3 = new PriorityQueue<>(queue1);
            queue3.retainAll(new HashSet<>(queue2));

                System.out.print(queue3);


        }

    public static void difference(PriorityQueue<String> q1,PriorityQueue<String> q2) {
        PriorityQueue<String> q3 = new PriorityQueue<>();
        q3.addAll(q1);
        q3.addAll(q2);
        PriorityQueue<String> q4 = new PriorityQueue<>();
        for (String element : q3) {
            if(!q4.contains(element))
            q4.add(element);
        }
        System.out.println(q4);

        }
    }

