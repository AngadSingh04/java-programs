interface flyable{
    int a = 10;
    void fly();
}
interface swimable{
    int b = 20;
    void swim();
}
class bird implements flyable,swimable{
    public void fly(){
        System.out.println("Bird is flying...");
    }
    public void swim(){
        System.out.println("Bird is swimming....");
    }
    public void display(){
        System.out.println("Wowwww");
    }
}
public class Trial {
    public static void main(String[] args) {
        flyable f = new bird();
        bird b1 = new bird();
        bird b2 = b1;
        b2.fly();
    }
}
