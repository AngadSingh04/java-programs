import java.util.Scanner;
class A{
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
public class java_euclidianAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(A.gcd(n1,n2));
    }
}
