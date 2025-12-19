package Polymorphism;

public class ObjectPrint {
    int n;
    ObjectPrint(int n){
        this.n = n;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);
    }
}
