import java.io.*;
// import java.nio.file.Files new input output package
import java.util.Scanner;
import java.util.Scanner;
public class CreateFileDemo {
    public static void main(String[] args) throws IOException {
        // File f2 = new File("NewFile2.txt");
        // f2.createNewFile();
        FileWriter fw = new FileWriter("NewFile2.txt",true);
        // fw.append("Voila !\n");
        // fw.append("Yo Yo ");
        fw.append("hiiii\n");
        fw.close();
    }
}
