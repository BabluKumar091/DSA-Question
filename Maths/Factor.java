
package Maths;

import java.util.ArrayList;

/**
 * Factor
 */
public class Factor {

    public static void main(String[] args) {
        
    }
    static void factor(int n){
        ArrayList<Integer> list = new  ArrayList<>();
         for(int i=1; i<Math.sqrt(n); i++){
          if(n%i == 0){
            if(n%i == i){
                System.out.print(i+ " ");
            }
            else{
                list.add(n/i);
            }
          }
        }
        for(int i=list.size(); i>0; i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}