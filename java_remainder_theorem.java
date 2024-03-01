import java.util.Scanner;
public class java_remainder_theorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[3];
        int[] m1 = new int[3];
        for(int i = 0;i<a1.length;i++){
            a1[i] = sc.nextInt();
            m1[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for(int i = 0; i<a1.length;i++){
            if(num%m1[i] ==a1[i]){
                System.out.println("correct he ji");
                break;
            }else{
                System.out.println("nhi he ji");
            }
        }
    }
}

