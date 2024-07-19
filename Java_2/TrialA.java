class AA{

    public AA(){
        System.out.println("Const from A....");
    }
    public AA(int a){
        System.out.println("Const from A with valuee  " + a);
    }
    void display(){
        System.out.println("Display from A");
    }
}
class B extends AA{
    B(){
        super();
    }
    B(int b){
        super(b);
    }
    void display(){
        System.out.println("Display from B");
    }
    void dis(){
        super.display();
    }
}
public class TrialA {
    public static void main(String[] args) {
        B a = new B(5);

    }
}
