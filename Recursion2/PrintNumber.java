package Recursion2;

public class PrintNumber {
    public static void main(String[] args) {
        int n = 5;
        oneToN(n);
        
    }

    static void printNumber(int n){
        if(n==1){
            System.out.print(n+ " ");
            return;
        }

        System.out.print(n+ " ");
        printNumber(n-1);
    }

    static void oneToN(int n){
        if(n == 0){
            return;
        }
       
        oneToN(n-1);
        System.out.println(n);
    }
}
