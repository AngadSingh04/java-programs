import java.util.Scanner;

public class Cons {
    int age;
    String name;
    static int count = 0;

    public Cons() {
        age = 0;
        name = "Angad";
        getCount();
    }

    public Cons(int a, String n) {
        age = a;
        name = n;
        getCount();
    }

    public static void getCount() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine(); 
        String name = sc.nextLine();
        
        Cons c1 = new Cons(); 
        Cons c2 = new Cons(age, name); 
        
        
        System.out.println("Total objects created: " + count);
    }
}
