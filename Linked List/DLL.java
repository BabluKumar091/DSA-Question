public class DLL {
  private  Node head;
  private  Node tail;
    private int size = 0;

    DLL(){
        size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        if(tail == null){
            tail = head;
        }

        head= node;
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        node.next = null;
        size++;
    }

    public void insert(int val, int indx){
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

        Node node = new Node(val, temp.next, temp.prev);
        // node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.val+ " -> ");
            node = node.next;
        }
        System.out.print("END");
        System.out.println(" Size = "+ size);

    }

    private class Node{
        Node next;
        Node prev;
        int val;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next,  Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
