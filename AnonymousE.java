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

class Cycle{
    public void gearUp(){
        System.out.println("Gear is starting....");
    }
    public void start(){

    }
}
class ECycle{
    public void display(){
        System.out.println("Electric Cycle is getting displayed.");
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
public class AnonymousE {
    public static void main(String[] args) {
        ECycle atlas = new ECycle();
        atlas.display();
    }
}

