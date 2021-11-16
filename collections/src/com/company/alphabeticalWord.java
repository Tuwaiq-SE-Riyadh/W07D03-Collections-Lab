package com.company;
import java.util.*;
import java.io.File;
import java.io.FileReader;


public class alphabeticalWord {
  public static void main(String[] args) throws Exception {
  List<String>list1=new ArrayList<String>();
  File file =new File("C:\\Users\\Tiii2\\OneDrive\\سطح المكتب\\collections\\src\\com\\company\\ randomWords.txt");
    Collections.sort(list1);
  Scanner source = new Scanner(file);
  while (source.hasNextLine())
          System.out.println(source.nextLine());









        }
    }

