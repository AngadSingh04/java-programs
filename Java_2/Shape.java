abstract class Person{
    abstract void display();
    public void work(){
        System.out.println("Collection of persons....");
    }
}
class Student extends Person{
    public void work(){
        System.out.println("Work for Student");
    }
    void display(){
        System.out.println("Display from student....");
    }
}
class Employee extends Person{
    void display(){
        System.out.println("Display from employee......");
    }
} 
public class Shape {
    public static void main(String[] args) {
        Person p = new Student();
        p.work();
    }
}
