import java.util.ArrayList;

public class Student extends SchoolPerson{
    private int grade;
    private double gpa;
    private ArrayList<String> classesEnrolled;

    

    public Student(String name, String email, int age, int grade, double gpa, ArrayList<String> ce){
        super(age, name, email);
        this.grade = grade;
        this.gpa = gpa;
        classesEnrolled = ce;
    }

    public void addClasses(String c){
        classesEnrolled.add(c);
    }

    public ArrayList<String> getClasses(){
        return classesEnrolled;
    }

    public void introduce(){
        System.out.println("Hello I'm a student, my name is " + getName() + ", my email address is " + getEmail());
    }
}