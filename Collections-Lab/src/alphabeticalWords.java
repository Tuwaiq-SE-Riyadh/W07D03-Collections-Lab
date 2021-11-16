import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class alphabeticalWords {
    public static void main(String [] args) throws FileNotFoundException {
        List<String> arrayList = new ArrayList<String>();
        File myObj = new File("C:/Users/manal/Desktop/Java/W07D03-Collections-Lab/Collections-Lab/src/randomWords.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            arrayList.add(myReader.nextLine());
        }
        System.out.println("Before Sorting: ");
        System.out.println(arrayList);
        System.out.println("After Sorting: ");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}

