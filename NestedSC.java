
class Outer{
    private static int outx = 10;
    static int outy = 20;
    static void displayO(){
        System.out.println("Outer.....");
    }

    static class Inner{
        private int innerx;
        void display(){
            System.out.println("Outer x " + outx);
            System.out.println("Outer y " + outy);
            displayO();
        }
    }
}


public class NestedSC {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.displayO();
        Outer.Inner obj = new Outer.Inner();
        obj.display();
        
        
    }
}
