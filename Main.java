package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/reemaibrahim/Desktop/alphabeticalWords.java/randomWords");

        Scanner sc  = new Scanner (file);
        ArrayList<String> collection = new ArrayList<String>();

        while (sc.hasNext()){
            collection.add(sc.next());
        }
        System.out.println(collection);

        Collections.sort(collection);
        System.out.println(collection);

    }
}
