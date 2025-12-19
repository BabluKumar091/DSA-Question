package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println(b.h+ " "+ b.l + " " + b.w);

        Box b2 = new Box(4);
        System.out.println(b2.h+ " "+ b2.l + " " + b2.w);

        Box b3 = new Box(4, 7, 8);
        System.out.println(b3.h+ " "+ b3.l + " " + b3.w);

        b.display();
    }
}
