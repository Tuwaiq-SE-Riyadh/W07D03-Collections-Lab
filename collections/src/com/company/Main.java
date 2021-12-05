package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        List<String> list1=new ArrayList<String>();
        File file =new File("C:\\Users\\Tiii2\\OneDrive\\سطح المكتب\\collections\\src\\com\\company\\ randomWords.txt");

        Scanner source = new Scanner(file);
        while (source.hasNextLine())

            list1.add(source.nextLine());
            Collections.sort(list1);
            System.out.println(list1);
//        System.out.println(source.hasNextLine());


    }
}
