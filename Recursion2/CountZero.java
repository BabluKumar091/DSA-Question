package Recursion2;
public class CountZero {
    public static void main(String[] args) {
        int n = 30204;
        System.out.println(countZero(n));
    }

    static int count = 0;
    static int countZero(int n){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return count+1+ countZero(n/10);
        }
        else{
            return count + countZero(n/10);
        }
    }
}
