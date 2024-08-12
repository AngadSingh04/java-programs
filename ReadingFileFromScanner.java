import java.io.*;
import java.util.*;
public class ReadingFileFromScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("Test.txt");
        Scanner sc = new Scanner(f1);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
