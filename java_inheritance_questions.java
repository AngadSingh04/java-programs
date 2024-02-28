class circle{
    public float r;
    circle(float r){
        System.out.println(Math.PI*r*r);
        this.r=r;
    }
    
}
class cylinder extends circle{
    public float h;
    cylinder(float r, float h){
        super(r);
        System.out.println(2*Math.PI*r*h + 2*Math.PI*r*r);
        this.h=h;
    }
    

}
public class java_inheritance_questions {
    public static void main(String[] args) {
        cylinder a1 = new cylinder(5,10);
    }
}
