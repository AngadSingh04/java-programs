import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        mystack.push(24);
        mystack.push(10);
        mystack.push(25);
        System.out.println(mystack);
        mystack.pop();
        System.out.println(mystack);
    }
}
