import java.util.Arrays;
import java.util.Scanner;

public class java_armstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        int sum = 0;
        int digitChar = s.length();
        for(int i = 0; i<c.length;i++){
            int digit = Character.getNumericValue(c[i]);
            sum+= Math.pow(digit,digitChar);
        }
        String rsum = Integer.toString(sum);
        char[] rc = rsum.toCharArray();
        if(Arrays.equals(c,rc)){
            System.out.println("It is an Armstrong number");
        } else{
            System.out.println("It is not an Armstrong number");
        }
        sc.close();
        
        

    }
}
