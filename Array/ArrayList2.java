package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
      ArrayList<Integer> list= new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      
    //   list.add(18);
    //   list.add(17);
    //   list.add(15);
    //   list.add(13);
    //     list.add(24);
    //  list.add(10);

    //  System.out.println(list);
    //  list.remove(3);
    //  System.out.println(list);

    // +++++++++++++++++ Take value from User
      for (int i = 0; i <5; i++) {
        list.add(sc.nextInt());
      }

    // for (int i = 0; i < 5; i++) {
    //   System.out.println(list.get(i));
    // }

    System.out.println(list);

    }
}
