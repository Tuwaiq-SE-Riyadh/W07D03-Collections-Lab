package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueues {
    public static void main(String[] args) {

        /*
        Create a Java file called priorityQueues.java. Inside, create two priority queues,
         {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and
         {"George", "Katie", "Kevin", "Michelle", "Ryan"}.
         */
        PriorityQueue <String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.offer("George");
        priorityQueue1.offer("Jim");
        priorityQueue1.offer("John");
        priorityQueue1.offer("Blake");
        priorityQueue1.offer("Kevin");
        priorityQueue1.offer("Michael");

        PriorityQueue <String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.offer("George");
        priorityQueue2.offer("Katie");
        priorityQueue2.offer("Kevin");
        priorityQueue2.offer("Michelle");
        priorityQueue2.offer("Ryan");

        findUnion(priorityQueue1,priorityQueue2);
    }

    private static void findUnion(PriorityQueue<String> priorityQueue1, PriorityQueue<String> priorityQueue2)
    {
        System.out.println("=====================================================");
        System.out.println("1:"+priorityQueue1);
        System.out.println("2:"+priorityQueue2);
        System.out.println("-------- After Union --------");
        PriorityQueue <String> result = new PriorityQueue<>();
        result.addAll(priorityQueue1);

        while (priorityQueue2.size() > 0)
        {
            if(!priorityQueue1.contains(priorityQueue2.peek()))
            {
                result.offer(priorityQueue2.remove());
            }
            else {
                priorityQueue2.remove();
            }

        }
        System.out.println(result);
        System.out.println("=====================================================");
    }
}
