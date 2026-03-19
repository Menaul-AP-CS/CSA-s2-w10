import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> classList = new ArrayList<String>();
        classList.add("AP CS A");
        System.out.println(classList);

        Student s1 = new Student("Ann", "ann@menaulschool.net", 18, 12, 3.3, classList);
        System.out.println(s1.getClasses());
        s1.introduce();
        
        Principal p1 = new Principal("Mary", 40, "xxx@menaul.net", 12);
        p1.introduce();

        System.out.println(s1);
    }
}