public class Animal {
    String sound;
    String name;
    public Animal(){
        sound = "No Sound";
        name = "No Name";
    }
    public Animal(String a, String b){
        sound = a;
        name = b;
    }
    public Animal(String c){
        sound = "NO sound";
        name = c;
    }
    public void display(){
        System.out.println(sound);
        System.out.println(name);
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Animal anm1 = new Animal();
        Animal anm2 = new Animal("owl");
        Animal anm3 = new Animal("bark", " dog");
       System.out.println(Animal.add(10, 10));
    }
}
