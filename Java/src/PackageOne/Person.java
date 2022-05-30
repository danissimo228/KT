package PackageOne;

public abstract class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public Person(String name){
        this.name = name;
    }

    public abstract void PrintInfo();
}


