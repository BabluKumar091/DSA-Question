package Inheritence;

class A{
    A(){
        System.out.println("This is A class!..");
    }
}

class B extends A{
    B(){
        System.out.println("This is B class!...");
    }
}

class C extends B{
    C(){
        System.out.println("This is C class!...");
    }
}

public class ConstructorCall {
   public static void main(String[] args) {
        C c = new C();
   }
}
