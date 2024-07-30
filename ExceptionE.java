public class ExceptionE {
    public static void main(String[] args) {
        try {
            // long[] a = new long[Integer.MAX_VALUE]; // out of memory error
            // String name = null;
            // System.out.println(name.length()); // Null Pointer Exception
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
