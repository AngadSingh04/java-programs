import java.util.Scanner;
class isPrime{
    public static boolean p(int a){
        if(a<=1){
            return false;
        }
        for(int i = 2; i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}

public class java_primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime.p(n));
    }
}
