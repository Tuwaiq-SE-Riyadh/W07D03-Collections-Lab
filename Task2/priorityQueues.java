package com.company;

import java.util.*;

public class priorityQueues {

    public static void main(String[] args) {

        Queue q1 = new LinkedList();
        Queue q2 = new LinkedList();

        ArrayList<String> union =new ArrayList<String>();
        ArrayList<String> difference =new ArrayList<String>();
        ArrayList<String> intersection =new ArrayList<String>();

        q1.add("George");
        q1.add("Jim");
        q1.add("John");
        q1.add("Blake");
        q1.add("Kevin");
        q1.add("Michael");
        //-------------------
        q2.add("George");
        q2.add("Katie");
        q2.add("Kevin");
        q2.add("Michelle");
        q2.add("Ryan");


        for(int i = 0 ; i < q1.size() ; i++){
            String temp =(String)q1.peek();
            q1.remove();
            q1.add(temp);
            union.add(temp);
        }

        for(int i = 0 ; i < q2.size() ; i++){
            String temp =(String)q2.peek();
            q2.remove();
            q2.add(temp);
            if(! union.contains(temp)){
                union.add(temp);

            }
        }

        for(int i = 0 ; i < q1.size() ; i++){
            if( q2.contains(q1.peek()) ){
                intersection.add((String)q1.peek());
            }
            String temp =(String)q1.peek();
            q1.remove();
            q1.add(temp);
        }


        for(int i = 0 ; i < q1.size() ; i++){
            if(!q2.contains(q1.peek()) ){
                difference.add((String)q1.peek());
            }
            String temp =(String)q1.peek();
            q1.remove();
            q1.add(temp);
        }
        for(int i = 0 ; i < q2.size() ; i++){
            if(!q1.contains(q2.peek()) ){
                difference.add((String)q2.peek());
            }
            String temp =(String)q2.peek();
            q2.remove();
            q2.add(temp);
        }
        System.out.println("Union:\n"+union.toString());
        System.out.println("Difference:\n"+difference.toString());
        System.out.println("Intersection:\n"+intersection.toString());

    }
}
