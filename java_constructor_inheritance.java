
class hello{
    hello(){
        System.out.println("Hello Everyone");
    }
}
class parent_hello extends hello{
    parent_hello(){
        System.out.println("Parent Hello Everyone");
    }
}
public class java_constructor_inheritance{
    public static void main(String[] args) {
        parent_hello n1 = new parent_hello();
    }
}

