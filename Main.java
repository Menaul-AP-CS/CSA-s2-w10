import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentClasses = new ArrayList<String>();
        studentClasses.add("AP CSA");
        studentClasses.add("English");

        ArrayList<String> teacherCourses = new ArrayList<String>();
        teacherCourses.add("AP CSA");
        teacherCourses.add("AP CSP");

        Student s1 = new Student("Alala", 16, "alala@menaulschool.net", 11, 3.9, studentClasses);
        Teacher t1 = new Teacher("Ms. Liu", 23, "jliu@menaulschool.org", teacherCourses);
        Principal p1 = new Principal("Dr.Imaginary", 30, "imaginary@menaulschool.org", 12);

        s1.introduce();
        t1.introduce();
        p1.introduce();
    }
}