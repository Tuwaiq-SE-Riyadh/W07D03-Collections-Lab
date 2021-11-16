import java.util.PriorityQueue;

public class priorityQueues {
    public static void main(String []args){
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

        System.out.println("Queue 1: " + queue1);
        System.out.println("Queue 2: " + queue2);
        System.out.println("Union : " + union(queue1,queue2));
        System.out.println("Queue 1 after difference : " + difference(queue1,queue2));
        System.out.println("Queue 2 after difference : " + difference(queue2,queue1));
        System.out.println("Intersection: " + intersection(queue2,queue1));


    }

    public static PriorityQueue<String> union(PriorityQueue<String> q1 , PriorityQueue<String> q2){
        PriorityQueue<String> result = new PriorityQueue<String>(q1);
        result.addAll(q2);
        return result;
    }

    public static PriorityQueue<String> difference(PriorityQueue<String> q1 , PriorityQueue<String> q2){
        PriorityQueue<String> result = new PriorityQueue<String>(q1);
        result.removeAll(q2);
        return result;
    }

    public static PriorityQueue<String> intersection(PriorityQueue<String> q1 , PriorityQueue<String> q2){
        PriorityQueue<String> result = new PriorityQueue<String>();
        for(String string:q2){
            if(q1.contains(string)){
                result.add(string);
            }
        }
        return result;
    }


}
