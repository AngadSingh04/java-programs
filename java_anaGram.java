import java.util.Arrays;
import java.util.Scanner;
public class java_anaGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String check = sc.next();
        char[] s = str.toCharArray();
        // for(int i = 0;i<s.length;i++){
        //     System.out.println(s[i]);
        // }
        char[] c = check.toCharArray();
        Arrays.sort(s);
        Arrays.sort(c);
        
        if(Arrays.equals(s, c)){
            System.out.println("yess");
        }else{
            System.out.println("nooo");
        }
        sc.close();
        

    }
}
