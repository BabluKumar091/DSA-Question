import java.util.*;

public class pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lenght of pattern: ");
        int len = sc.nextInt();
        for(int i=1; i<=len; i++){
            for(int j=len/2+2; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}