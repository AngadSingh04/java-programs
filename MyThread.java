class AdditionThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
} 
class MultiplicationThread extends Thread{
    @Override
    public void run(){

    }
}
public class MyThread {
    public static void main(String[] args) {
        MyThreadApp t1 = new MyThreadApp();
        MyThreadApp t2 = new MyThreadApp();

        t1.start();// Concurrent
        t2.start();// Concurrent
        // t1.run(); // Sequential
        // t2.run();//Sequential
    }
}
