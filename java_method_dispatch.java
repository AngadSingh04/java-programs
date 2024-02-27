class A{
    public void one(){
        System.out.println("hello one from class A");
    }
    public void two(){
        System.out.println("hello two from class A");
    }
}
class B extends A{
    public void three(){
        System.out.println("hello three from class B");
    }
    public void two(){
        System.out.println("hello two from class B");
    }
}
public class java_method_dispatch {
    public static void main(String[] args) {
        A a1 = new B();
        a1.two();
    }
}
