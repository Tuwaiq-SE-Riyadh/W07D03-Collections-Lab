package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlphabeticalWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\abdul\\IdeaProjects\\Collections Lab\\src\\com\\company\\randomWords.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        ArrayList<String> arr = new ArrayList<String>();

        //String a = sc.next();
        //System.out.println(sc.next());
        while (sc.hasNextLine()){
            arr.add(sc.nextLine());
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
