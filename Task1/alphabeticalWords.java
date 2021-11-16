package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class alphabeticalWords {

    public static void main(String[] args) {

        try {
            ArrayList<String> arr = new ArrayList<String>();

            File text = new File("src/com/company/randomWords.txt");
            Scanner textFile = new Scanner(text);

            while (textFile.hasNext()) {
                arr.add(textFile.next());
            }

            textFile.close();

            Collections.sort(arr);
            System.out.println(arr.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
