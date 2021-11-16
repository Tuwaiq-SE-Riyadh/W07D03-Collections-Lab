package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        List<String>arrayList = new ArrayList<>();
        try
        {
            Scanner in = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\lab2\\src\\com\\company\\randomWords.txt"));
            String line;
            while ((line = in.nextLine())!=null)
            {
                String[] tokens = line.split("[||n|\t|\r|.|,|)|(|-|\"]");



                for (int i = 0; i  < tokens.length; i++)

                    arrayList.add(tokens[i]);

            }
        }
        catch (Exception ex)
        {

        }
        Collections.sort(arrayList);

        Iterator iterator = arrayList.iterator();
        System.out.println("\nDisplay words in ascending order");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
    }

