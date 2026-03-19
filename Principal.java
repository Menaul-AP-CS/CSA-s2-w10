public class Principal extends SchoolPerson {
    
    private int workage;

    public Principal(String name, int age, String email, int workage){
        super(age, name, email);
        this.workage = workage;
    }

    public void introduce(){
        System.out.println("Hello, I’m ," + getName() + "I'm the principal of the school. I’ve been working here for " +  workage + " years!");
    }

}
