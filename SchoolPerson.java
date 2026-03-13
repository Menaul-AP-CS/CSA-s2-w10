public class SchoolPerson {
    private String name;
    private int age;
    private String email;

    public SchoolPerson(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void introduce() {
        System.out.println("Hello, I'm " + name + ", contact me at " + email + ".");
    }
}