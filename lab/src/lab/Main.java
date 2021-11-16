package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Create a text file called randomWords.txt and a Java file called alphabeticalWords.java.
//        Inside, write a program that reads words from the text file and displays all the words (duplicates allowed)
//        in ascending alphabetical order. The words must start with a letter.

        File file = new File("/Users/shrooqsaleh/Desktop/tuwaiq/Lab code/Week6/W07D03-Collections-Lab/lab/src/lab/randomWords.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }

}
