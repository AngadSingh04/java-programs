import java.util.Arrays;
public class ArraysPractice {
    public static void main(String[] args) {
        boolean[] b1 = {false,false,false};
        boolean[] b2 = {true, false, false};
        int result = Arrays.compare(b1,b2);
        System.out.println(result);
        int[] a1 = {1,5,4,2,10,9};
        Arrays.sort(a1);
        for(int num: a1){
            System.out.println(num);
        }
    }
}
