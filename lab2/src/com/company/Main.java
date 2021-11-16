package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        List <String> arrayList =new ArrayList<String>();

        try {
            File myObj = new File("randomWords.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data;
                arrayList.add( data= myReader.next());

            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

}
