package Java;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\SARAH\\IdeaProjects\\readText\\src\\Java\\randomWords.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String strArray[] = data.split(" ");
                int n=strArray.length;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {

                        // to compare one string with other strings
                        if (strArray[i].compareTo(strArray[j]) > 0) {
                            // swapping
                            temp = strArray[i];
                            strArray[i] = strArray[j];
                            strArray[j] = temp;
                        }
                    }
                }

                // print output array
                System.out.println(
                        "The File in alphabetical order are: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(" "+strArray[i]+" ");
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}