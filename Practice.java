import java.util.Arrays;

public class Practice {

    public static boolean armstrong(int n) {
        int no_digit = noOfDigit(n);
        int temp = n;
        int sum_digit = 0;
        while (temp > 0) {
            int rmd = temp % 10;
            sum_digit += Math.pow(rmd, no_digit);
            temp = temp / 10;
        }

        if( n== sum_digit){
            return true;
        }

        return false;
    }

    public static int noOfDigit(int n){
        int c = 0;
        while (n>0) {
            int rmd = n%10;
            c++;
            n = n/10;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
}
