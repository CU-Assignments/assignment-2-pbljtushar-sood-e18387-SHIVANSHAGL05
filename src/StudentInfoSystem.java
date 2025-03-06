abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void displayDetails();
    public String getName() { return name; }
    public int getAge() { return age; }
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Roll Number: " + rollNumber);
    }
}
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Subject: " + subject);
    }
}
public class StudentInfoSystem {
    public static void main(String[] args) {
        Person student = new Student("Alice", 20, 101);
        Person teacher = new Teacher("Mr. Smith", 35, "Mathematics");
        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
    }
}
