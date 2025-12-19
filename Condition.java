public class Condition {
    public static void main(String[] args) {
        int salary = 2500;
        if(salary > 2000 ){
            salary = salary + 2000;
        }
        else{
            salary = salary - 2000;
        }
        System.out.println(salary);
    }
}
