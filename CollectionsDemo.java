import java.util.*;
public class CollectionsDemo {
    public static void main(String[] args) {
        // ArrayList<String> list1 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("Angad");
        list1.add("junior");
        list1.add("haya");
        list1.add("ola");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);
        System.out.println(list1.get(0));

    }
}
