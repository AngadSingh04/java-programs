import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleFileIO {
    public static void main(String[] args) {
        String content = "Hello, World!";  // Data to be written to the file

        // Write data to file
        try (FileOutputStream outputStream = new FileOutputStream("example.txt")) {
            outputStream.write(content.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from file
        try (FileInputStream inputStream = new FileInputStream("example.txt")) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
            System.out.println("\nData read from file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
