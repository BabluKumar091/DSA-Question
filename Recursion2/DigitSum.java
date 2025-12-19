package Recursion2;

public class DigitSum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(digitSum(n));
        
    }

    static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        int rem  = n%10;
        return rem + digitSum(n/10);
    }
}
