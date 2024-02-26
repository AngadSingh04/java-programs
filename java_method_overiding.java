
class first_class{
    public void met1(){
        System.out.println("hello met1 of first class");
    }
    public void met2(){
        System.out.println("hello met2 of first class");
    }
}
class second_class extends first_class{
    @Override
    public void met2(){
        System.out.println("hello met2 of second class");
    }
}
public class java_method_overiding {
    public static void main(String[] args) {
        second_class a1 = new second_class();
        a1.met2();
        
    }
}
