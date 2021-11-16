package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static <collection> void main(String[] args) {

        try {
            File myObj = new File("alphabeticalWords.text");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> allName = new ArrayList<String>();

            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                System.out.println(data);
                allName.add(data);
            }

            System.out.println("\n Before Sorting:" + allName);
            Collections.sort(allName);
            System.out.println(" After Sorting:" + allName);


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
