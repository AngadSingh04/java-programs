import java.util.Scanner;
public class java_block_swap_algorithm {
    public static void block_swap(int[] arr, int n, int k){
        if(n==0){
            return;
        }
        k = k%n;
        if(k>n){
            return;
        }
        int temp[] = new int[k];
        for(int i = 0; i<k;i++){
            temp[i] = arr[i];
        }
        for(int i = 0;i<n-k;i++){
            arr[i] = arr[i+k];
        }
        for(int i = n-k; i<n;i++){
            arr[i] = temp[i-n+k];
        }

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();
         int[] arr = new int[n];
         for(int i = 0; i<n;i++){
            arr[i]  = sc.nextInt();
         }
         System.out.println("After swapping: ");
         for(int i = 0; i<n;i++){
            System.out.println(arr[i]+ " ");
         }
         block_swap(arr, n, k);
         System.out.println("after swapping: ");
         for(int i = 0; i<n;i++){
            System.out.println(arr[i]+ " ");
         }
    }
}
