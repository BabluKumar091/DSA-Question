package Interface;

public class Client implements Callback {
   public void callback(int p){
        System.out.println("Callback call with "+ p );
    }
}
