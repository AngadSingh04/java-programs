import java.util.Scanner;
class isLeapYear{
    public void lp(int year){
        boolean isLeapY;
        isLeapY = ((year%4)==0);
        isLeapY = (isLeapY && (((year%100)!=0) || ((year%400)==0)));
        if(isLeapY){
            System.out.println(year + "is a leap year");
        }else{
            System.out.println(year + "is not a leap year");
        }
        
    }
}
public class java_isleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isLeapYear abc = new isLeapYear();
        int x = sc.nextInt();
        abc.lp(x);

        
    }
}
