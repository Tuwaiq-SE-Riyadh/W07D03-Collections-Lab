package com.company;
import java.util.*;
public class priorityQueues {
    private static Object PriorityQueue;

    public static void main(String[] args){
        PriorityQueue<String> queue1=new PriorityQueue<String>();
        PriorityQueue<String> queue2=new PriorityQueue<String>();
        PriorityQueue<String> queue3= new PriorityQueue<>();
        queue1.offer("George");
        queue1.offer("Jim");
        queue1.offer("John");
        queue1.offer("Blake");
        queue1.offer("Kevin");
        queue1.offer("Michael");



        queue2.offer("George");
        queue2.offer("Katie");
        queue2.offer("Kevin");
        queue2.offer("Michelle");
        queue2.offer("Ryan");


//        PriorityQueue<String> union(PriorityQueue<String> queue1, PriorityQueue<String> queue2){
//            PriorityQueue<String> queue3= new PriorityQueue<>();
//            queue3.addAll(queue1);
//            queue3.addAll(queue2);
//        System.out.println("Union: " + union(queue1, queue2));
        public static PriorityQueue<String> intersection(PriorityQueue<String> queue1, PriorityQueue<String> queue2{
            PriorityQueue<String> q3 = new PriorityQueue<>();
            for(String string:queue1){
                if(queue2.contains(string)){
                    queue3.add(string);
                }
            }
            return queue3;
        }
        public static PriorityQueue<String> difference boolean intersectionQueue;
        (PriorityQueue<String> queue1, PriorityQueue<String> intersectionQueue){
            PriorityQueue<String> q3 = new PriorityQueue<>();
            for(String string:queue1){
                if(intersectionQueue.contains(string)){

                }else{
                    queue3.add(string);
                }
            }
            return queue3;
        }
    }
}
