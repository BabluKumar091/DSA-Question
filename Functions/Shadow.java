public class Shadow {
    static int x = 20;
    public static void main(String[] args) {
        System.out.println(x);
        show();
        int x = 30;
        System.out.println(x);
       
    }
    static void show(){
        System.out.println(x);
    }
}
