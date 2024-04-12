import java.util.Scanner;

class simpleCalculator {
    public void c(int a, int b){
        System.out.println("Sum is : " + (a+b));
        System.out.println("Difference is: "+ (a-b));
        System.out.println("product is: "+ (a*b));
    }
}

public class java_simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        simpleCalculator abc = new simpleCalculator();
        int x = sc.nextInt();
        int y = sc.nextInt();
        abc.c(x, y);
        

    }
}
