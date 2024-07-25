// class Cycle{
//     public void gearUp(){
//         System.out.println("This is cycle gear ....");
//     }
//     public void start(){}
// }
// public class AnonymousE {
//     public static void main(String[] args) {
//         Cycle hero = new Cycle(){
//             public void gearUp(){
//                 System.out.println("This is anonymous cycle gear");
//             }
//             public void start(){
//                 System.out.println("Anonymous class is starting...");
//             }
//         };
//         hero.gearUp();
//         hero.start();
//     }
// }

interface Cycle{
    public void gearUp();
    public void start();
}
public class AnonymousE {
    public static void main(String[] args) {
        Cycle hero = new Cycle(){
            public void gearUp(){
                System.out.println("This is anonymous cycle gear");
            }
            public void start(){
                System.out.println("Anonymous class is starting...");
            }
        };
        hero.gearUp();
        hero.start();
    }
}

