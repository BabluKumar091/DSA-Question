import java.util.*;

public class Febonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int a=0;
        int b = 1;
        System.out.println("febonacci series "+ a+" "+ b);
        for(int i=1; i<n-1; i++){
           int sum = a+b;
            a=b;
            b= sum;
            System.out.print(sum+ " ");
        }
    }
}