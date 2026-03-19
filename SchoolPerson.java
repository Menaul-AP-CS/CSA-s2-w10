public class SchoolPerson {
    private String name, email;
    private int age;

    public SchoolPerson(int a, String n, String e){
        age = a;
        name = n;
        email = e;
    }

    public void introduce(){
        System.out.println("Hello my name is " + name + ", my email address is " + email);
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }



}
