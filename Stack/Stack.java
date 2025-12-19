public class Stack{
    protected int[]  data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.data = new int[size];
    }

    public boolean push(int val){
        if(isFull()){
          System.out.println("Data cann't be push");
          return false;
        }

        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Data cann't be pop");
        }

        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Data cann't be pop");
        }

        return data[ptr];
    }

    public int size(){
        return ptr+1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for (int i=0; i<=ptr; i++){
            System.out.print(" "+data[i]);
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }
}