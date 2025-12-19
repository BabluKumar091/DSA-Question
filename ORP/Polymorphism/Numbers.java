package Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    void sum(int a, String b, float c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers(); 
        System.out.println(obj.sum(2,5 ));
        System.out.println(obj.sum(12, 14, 90));
        obj.sum(12,"Rohan", 45);
    }
}
