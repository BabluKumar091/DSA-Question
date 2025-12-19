import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lenght of pattern: ");
        int len = sc.nextInt();
        for(int i=1; i<=len; i++){
            for(int j=1; j<=len; j++){
                if(i==1 || i==len || j==1 || j==len){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
