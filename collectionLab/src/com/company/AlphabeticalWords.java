package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class AlphabeticalWords {

        public static void main(String[] args) {
            List<String> list=new ArrayList<String>();
            try {
                File myObj = new File("randomWords.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNext()) {
                    String data = myReader.next();
                    list.add(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list);
        }
    }


