import java.util.Scanner;
public class java_apple_alice {

    static int alice(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int k = 15;
        
        if(m<=s*k+w+e){
            return m;
        }else{
            return -1;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the details: ");
        System.out.println(alice());
    }
}
