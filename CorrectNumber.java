import java.util.Scanner;
class InvalidNumber extends Exception{
    InvalidNumber(String s){
        super(s);
    }
}
public class CorrectNumber {
    static void validateNumber(int x)throws InvalidNumber{
        if(x == 0000000000){
            throw new InvalidNumber("This number is not invalid");
        }else{
            System.out.println("Correct number entered");
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        try{
            validateNumber(number);
        }catch(InvalidNumber e){
            System.out.println(e.getMessage());
        }
    }
}
