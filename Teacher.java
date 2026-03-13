import java.util.ArrayList;

public class Teacher extends SchoolPerson {
    private ArrayList<String> coursesTeaching;

    public Teacher(String name, int age, String email, ArrayList<String> coursesTeaching) {
        super(name, age, email);
        this.coursesTeaching = coursesTeaching;
    }

    public ArrayList<String> getCoursesTeaching() {
        return coursesTeaching;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + getName() + ", contact me at " + getEmail() + ".");
    }
}