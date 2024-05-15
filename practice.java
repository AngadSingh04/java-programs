import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = (i + 1) * arr[i - 1] + arr[i - 1];
            System.out.println(arr[i]);
        }
        sc.close();
    }
}