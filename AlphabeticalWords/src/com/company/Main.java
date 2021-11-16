package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("D:\\TUWAIQ\\W07D03-Collections-Lab\\AlphabeticalWords\\src\\com\\company\\randomWords.txt"));
        ArrayList<String> collection=new ArrayList<String>();
        while(s.hasNext()){
            collection.add(s.next());
        }
        System.out.println("Array before sort "+collection);
        Collections.sort(collection);
        System.out.println("Array after sort "+collection);
    }
}
