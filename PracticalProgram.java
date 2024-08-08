abstract class ShapeX{
    abstract double area();
    static class NestedClass{
        void display(){
            System.out.println("This is static nested class");
        }
    }
    class NonNestedClass{
        void display(){
            System.out.println("This is non static nested class");
        }
    }
}
class Circle extends ShapeX{
    private double radius;
    Circle(double r){
        radius = r;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

public class PracticalProgram {
    public static void main(String[] args) {
        ShapeX.NestedClass staticClass = new ShapeX.NestedClass();
        Circle a = new Circle(10);

        ShapeX.NonNestedClass nonStaticClass = a.new NonNestedClass();
        nonStaticClass.display();
        double ans = a.area();
        System.out.println(ans);

    }
}
