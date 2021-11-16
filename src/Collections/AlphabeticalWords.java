package Collections;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.Scanner;


public class AlphabeticalWords {

    public static void main(String[] args) {

        List<String> obj1 = new ArrayList<String>();

        try {
            File randomWordsObject = new File("src/Collections/randomWords"); // https://www.w3schools.com/java/java_files_read.asp
            Scanner sc = new Scanner(randomWordsObject);

            while (sc.hasNext()) {
                String data = sc.next();
                obj1.add(data);
//                System.out.println(data);
            }
            sc.close();
        }catch (Exception e)
        {
            System.out.println("Exception:" + e.getLocalizedMessage());
        }

        System.out.println("-----------------------------------------[Before Sorting]-----------------------------------------");
        System.out.println(obj1);

        System.out.println("-----------------------------------------[After Sorting]-----------------------------------------");
        Collections.sort(obj1);
        System.out.println(obj1);
    }

}
