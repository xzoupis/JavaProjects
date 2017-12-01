import java.util.Scanner;
import java.io.File;

public class WordCount {


    public static void main(String [] args) throws Exception{
        File file = new File("pg55720.txt");
        int words = 0;
        Scanner fileScanner = new Scanner(file);
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();

            words = words + line.split(" ").length;
        }

        System.out.println("There are " + words + " words in this document!");
    }
}
