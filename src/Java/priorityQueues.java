package Java;
import java.util.*;
public class priorityQueues {

        public static void main(String[] args) {
            PriorityQueue<String> queue1 = new PriorityQueue<String>();
            System.out.println(" ");
            //Adding strings to queue1
            queue1.add("George");
            queue1.add("Jim");
            queue1.add("John");
            queue1.add("Blake");
            queue1.add("Kevin");
            queue1.add("Michael");
//            System.out.println("Priority queue using Comparable:");
//
//            while (queue1.size() > 0) {
//                System.out.print(queue1.remove() + " ");
//            }

            PriorityQueue<String> queue2 = new PriorityQueue<String>();
            System.out.println(" ");
            //Adding strings to queue2
            queue2.offer("George");
            queue2.offer("Katie");
            queue2.offer("Kevin");
            queue2.offer("Michelle");
            queue2.offer("Ryan");
//            System.out.println("\nPriority queue using Comparator:");
//
//            while (queue2.size() > 0) {
//                System.out.print(queue2.remove() + " ");
//            }
            System.out.println("After union");
            union(queue1,queue2);
            System.out.println("\nAfter intersection");
            intersection(queue1,queue2);
            System.out.println("\nAfter difference");
            difference(queue1,queue2,intersection(queue1,queue2));
        }



        public static PriorityQueue<String> union(PriorityQueue<String> queue1, PriorityQueue<String> queue2){
            PriorityQueue<String> queue3 = new PriorityQueue<>();
            queue3.addAll(queue1);
            queue3.addAll(queue2);
               System.out.print(queue3);

            return queue3;
        }

        public static PriorityQueue<String> intersection(PriorityQueue<String> queue1, PriorityQueue<String> queue2) {
            PriorityQueue<String> queue3 = new PriorityQueue<>(queue1);
            queue3.retainAll(new HashSet<>(queue2));

                System.out.print(queue3);

            return queue3;
        }

    public static PriorityQueue<String> difference(PriorityQueue<String> q1,PriorityQueue<String> q2, PriorityQueue<String> intersectionQueue) {
        PriorityQueue<String> q3 = new PriorityQueue<>();
        q3.addAll(q1);

       q3.removeAll((intersectionQueue));

                System.out.print(q3);

            return q3;
        }
    }

