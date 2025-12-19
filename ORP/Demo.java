package ORP;

public class Demo {
    public static void main(String[] args) {
        Student rocky = new Student(20, "Rocky Bhai", 34);
        // rocky.rno = 20;
        // rocky.name = "Rocky Bhai";
        // rocky.age = 34;

        System.out.println(rocky.rno);
        System.out.println(rocky.name);
        System.out.println(rocky.age);

        Student random = new Student();

        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.age);
        Student one = new Student();
        Student two = one;
    
        one.name = "somethiung";
        System.out.println(two.name);
        
    }

   
}

class Student{
    int rno;
    String name;
    int age;

    Student(int rno, String name, int age){
        this.rno = rno;
        this.name = name;
        this.age = age;
    }

    Student(){
        this(12, "random boy", 35);
    }
}
