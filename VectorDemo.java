import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<>();
        myVector.add(25);
        myVector.add(25);
        myVector.add(25);
        myVector.add(25);
        myVector.remove(3);
        System.out.println(myVector);
    }
}
