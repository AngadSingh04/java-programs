public class java_factorial_fibonacci {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    static int fibonacci(int x){
        if(x<=1){
            return x;
        }
        return fibonacci(x-1)+fibonacci(x-2);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(6));
    }
}
