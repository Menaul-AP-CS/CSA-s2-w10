public class Principal extends SchoolPerson {
    private int workAge;

    public Principal(String name, int age, String email, int workAge) {
        super(name, age, email);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + getName() + ", the principal of the school. I've been working here for " + workAge + " years!");
    }
}