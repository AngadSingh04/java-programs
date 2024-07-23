import java.util.ArrayList;
class Course {
    private String name;
    private String code;
    private ArrayList<Person> students;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.students = new ArrayList<>();
    }

    public ArrayList<Person> getStudents() {
        return students;
    }

    public void addStudent(Person student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}

class Person {
    private String name;
    private String id;
    private String className;

    public Person(String initial_id) {
        this.id = initial_id;
    }

    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Class: " + className);
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
public class Main {
    public static void main(String[] args) {
        Course course = new Course("JAVA", "JAV1020");
        Person student1 = new Person("12345");
        student1.setName("Angad Singh");
        student1.setClassName("N/A");

        course.addStudent(student1);
        
        for (Person student : course.getStudents()) {
            student.printPerson();
        }
    }

}
