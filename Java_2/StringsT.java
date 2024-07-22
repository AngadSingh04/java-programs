import java.util.Arrays;

public class StringsT {
    public static void main(String[] args) {
       String a = " hello, World!";
       System.out.println(a.length());
       System.out.println(a.charAt(0));
       System.out.println(a.indexOf("World"));
       System.out.println(a.toLowerCase());
       System.out.println(a.toUpperCase());
       System.out.println(a.isEmpty());
       System.out.println(a.replace("h", "a"));
       System.out.println(a.trim());
       String[] aa = a.split(",");
       System.out.println(Arrays.toString(aa));
       System.out.println(a.lastIndexOf("o"));
    }
}
