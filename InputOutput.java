import java.io.*;
public class InputOutput{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Test.txt");
        int i;
        try {
            while((i = fr.read())!=-1){
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        fr.close();
    }
}
