class AdditionThread extends Thread{
    int a,b;
    AdditionThread(int x, int y){
        a = x;
        b = y;
    }
    @Override
    public void run(){
        int sum = a + b;
        System.out.println(sum);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
};
class MultiplicationThread extends Thread{
    int a,b;
    MultiplicationThread(int x, int y){
        a = x;
        b = y;
    }
    @Override
    public void run(){
        int product = a * b;
        System.out.println(product);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class AddMultiplyThread {
    public static void main(String[] args) {
        AdditionThread a1 = new AdditionThread(10, 20);
        MultiplicationThread p1 = new MultiplicationThread(10, 20);
        AdditionThread a2 = new AdditionThread(10, 20);
        MultiplicationThread p2 = new MultiplicationThread(10, 20);
        a1.start();
        a2.start();
        p1.start();
        p2.start();
    }
}
