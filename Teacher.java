import java.util.ArrayList;

public class Teacher extends SchoolPerson {
    
    private ArrayList<String> classesTeaching;


    public Teacher(String name, String email, int age, ArrayList<String> ct){
        super(age, name, email);
        classesTeaching = ct;
    }




}
