package ORP.packages.staticExample;

public class Human {
    public static void main(String[] args) {
        Message bk  = new Message(20, "Bablu Kumar",2045,false);
        Message rk  = new Message(29, "Rocky Kumar",2045, true);
        Message pk  = new Message(26, "pankaj Kumar",2045, true);


        System.out.println(bk.population);
        System.out.println(rk.population);


       
    }
}
