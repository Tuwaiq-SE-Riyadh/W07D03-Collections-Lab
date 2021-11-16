package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\iggha\\IdeaProjects\\untitled2\\src\\text.txt");
        Scanner input= new Scanner(file);
        ArrayList<String>collection= new ArrayList<String>();

        while (input.hasNext()){
        collection.add(input.next());
        }
        System.out.println("Befor :");
        System.out.println(collection);

        Collections.sort(collection);
        System.out.println("After :");

        System.out.println(collection);


	// write your code here
    }
}
