package PackageOne;

public class Employee extends Person {
    public int age;
    public Employee(String name, int age){
        super(name);
        this.age = age;
    }

    public void PrintInfo() {
        System.out.println("hi!" + this.name + " " + this.age);
    }
}
