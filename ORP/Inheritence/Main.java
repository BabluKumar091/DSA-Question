package Inheritence;

 class A   {

    int i;
    int j;
    void show(){
        System.out.println("This class A!..");
    }
}

class B extends A{
    int k;
    void show(){
        System.out.println("This is class B!..");
    }
    void sum(){
        System.out.println(i+j+k);
    }
}

public class Main {
   public static void main(String[] args) {
    A sup = new A();
    B sub = new B();

    sup.i = 10;
    sup.j = 20;
    sub.k = 30;

    sup.show();

    sub.sum();

    sub.i = 30; 
    sub.j = 40;
    sub.sum();
    sub.show();
   }
}
