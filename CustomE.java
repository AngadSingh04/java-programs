import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

public class CustomE {
    static void validateAge(int x) throws InvalidAgeException{
        if(x<0){
            System.out.println("Age can't be neagtive");
            throw new InvalidAgeException("Entered age is not correct");
        }else{
            System.out.println("Correct age entered");
        }
    }
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try{
            validateAge(age);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        
    }
}
