public class MultipleCatch {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            String s = null;
            // System.out.println("Length "+ s.length());
            System.out.println(arr[4]);
        }catch(NullPointerException | ArrayIndexOutOfBoundsException e){ // try --> multi-catch method
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("HELP MEEEEE");
        }
        
    }
}
