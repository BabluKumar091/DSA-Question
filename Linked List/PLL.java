public class PLL {
    int size;
    Node head;
    Node tail;

    PLL(){
        size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;

        size++;
    }

    public void inser(int val , int indx){
        if(indx == 0){
            insertFirst(val);
            return;
        }
        if(indx == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i<indx-1; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next =node;
        size++;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("size: "+ size);
    }

    private class Node{
        private int val;
        Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
