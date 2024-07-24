class Jeep{
    private String model;
    private String color;
    private Engine engine;
    public Jeep(String model, String color){
        this.model = model;
        this.color = color;
        this.engine = new Engine();
    }
    public void start(){
        System.out.println("Jeep Started");
        engine.startEngine();
        
    }
    private class Engine{
        public void startEngine(){
            System.out.println("helooooooo.....");
        }
    }
   
}

public class NestedNSC {
    public static void main(String[] args) {
        Jeep obj = new Jeep("thar", "red");   
        obj.start();
    }
}
