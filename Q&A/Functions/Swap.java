import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 10; 
        int b = 20;
        swap(a, b);
    }
    static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
        System.err.println("a = "+a+ " b = "+b);
    }
}
