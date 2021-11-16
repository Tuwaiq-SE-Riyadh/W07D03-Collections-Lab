package com.company;
import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner file = new Scanner(new File("C:\\Users\\Afnan\\IdeaProjects\\alphabeticalWords\\src\\randomWords.txt"));
        ArrayList<String> str = new ArrayList<String>();
        while(file.hasNext()){
            str.add(file.next());
        }

        System.out.println("Befor sort: "+str);
        Collections.sort(str);
        System.out.println("After sort: "+str);
    }
}
