package ORP.packages.staticExample;

public class Message {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Message(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Message.population += 1;
    }
}


