public class LL {
    Node head;
    Node tail;

    private int size;

    LL() {
        size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
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

        for(int i=1; i<indx; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        int val = head.val;
        if(size <= 1){
            System.out.println("No data exist!...");
        }
        head = head.next;
        size -= 1;
        return val;

    }

    public int delete(int indx){
        if(indx <=0){
            return deleteFirst();
        }
        if(indx == size){
            return deleteLast();
        }
        Node privousNode = get(indx -1);
        Node tagetNode = privousNode.next.next;
        int val = privousNode.next.val;
        privousNode.next = tagetNode;
        size -= 1;
        return val;

    }

    public int deleteLast(){
        int val = tail.val;
        if(head.next == null){
            return deleteFirst();
        }
        Node secondLastNode = get(size-2);
        tail = secondLastNode;
        tail.next = null;
        size -=1;
        return val;
    }

    public Node get(int size){
      Node node = head;
      for(int i=0; i<size; i++){
        node = node.next;
      }
      return node;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
        node = node.next;
        }

        return null;
    }

    public void display(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END"+ " size= "+ size);
    }

    private class Node {
        Node next;
        int val;
    
        Node(int val) {
            this.val = val;
        }
    
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    
        @Override
        public String toString() {
            return "Node{" + "val=" + val + '}';
        }
    }
    
}