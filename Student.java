public class Student extends SchoolPerson {
    private int gradeLevel;

    public Student(String name, String email, int gradeLevel) {
        super(name, email);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ". I'm in grade " + gradeLevel + ".");
    }
}