class A{
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends A{
    void eat(){
        System.out.println("Dog is eating....");
    }
    void sound(){
        System.out.println("bhow bhow");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
