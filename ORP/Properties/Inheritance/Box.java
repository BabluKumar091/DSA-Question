package Properties.Inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(int b){
        this.l = b;
        this.h = b;
        this.w = b;
    }

    Box(int a, int b, int c){
        this.l = a;
        this.h = b; 
        this.w = c;
    }

    public void display(){
        System.out.println("Box has many type property");
    }
}