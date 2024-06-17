import java.util.Scanner;

// Find Max Sum

public class java_maximumEquilibrium {
    static int findMaxSum(int[] arr, int n) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prefix_sum = 0;
            int suffix_sum = 0;
            
            // Calculate prefix sum
            for (int j = 0; j <= i; j++)
                prefix_sum += arr[j];
            
            // Calculate suffix sum
            for (int j = n - 1; j >= i; j--)
                suffix_sum += arr[j];
            
            // Check if prefix sum and suffix sum are equal
            if (prefix_sum == suffix_sum)
                res = Math.max(res, prefix_sum);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(findMaxSum(arr, n));
    }
}
