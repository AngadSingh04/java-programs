import java.util.Arrays;

class Factorial extends Thread{
    int a;
    Factorial(int x){
        a = x;
    }
    @Override
    public void run(){
        if(a == 0 || a == 1){
            System.out.println(1);
        }
        int sum = 1;
        for(int i = 2; i <= a; i++){
            sum = (i * sum);
        }
        System.out.println(sum);
    }
}
// class MaxNo extends Thread{
//     int a,b,c;
//     MaxNo(int x, int y, int z){
//         a=x;
//         b=y;
//         c=z;
//     }
//     @Override
//     public void run(){
//         if(a>b && a>c){
//             System.out.println(a);
//         }else if(b>a && b>c){
//             System.out.println(b);
//         }else{
//             System.out.println(c);
//         }
//     }
// }
class MaxNo extends Thread{
    int[] myarr;
    MaxNo(int[] arr){
        myarr = arr;
    }
    @Override
    public void run(){
        Arrays.sort(myarr);
        System.out.println(myarr[myarr.length -1]);
        
    }
}
public class FactorialMaximumThread {
    public static void main(String[] args) {
        Factorial f1 = new Factorial(5);
        int myarr[] = {1,2,10,13,5};
        MaxNo m1 = new MaxNo(myarr);
        f1.start();
        m1.start();
    }
}
