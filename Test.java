
// Multiple inheritance witht the help of interfaces.
// also promotes decoupling and flexibility

interface InterfaceA {
    void methodA();
}
interface InterfaceB {
    void methodB();
}
class MyClass implements InterfaceA, InterfaceB {
   
    public void methodA() {
        System.out.println("This is methodA from InterfaceA");
    }

    public void methodB() {
        System.out.println("This is methodB from InterfaceB");
    }
}
public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.methodA();
        obj.methodB();
    }
}
