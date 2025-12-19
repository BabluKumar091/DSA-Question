public class Main {
    public static void main(String[] args) {
        // Stack st = new Stack();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(50);
        // st.display();
        // System.out.println(st.size());
        
            
        // try {
        //     System.out.println("Popped: " + st.pop()); // Should remove and return 50
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // } 

        Queue q = new Queue();
        q.insert(20);
        q.insert(40);
        q.insert(27);
        q.insert(69);
        q.insert(60);
        q.insert(49);
        q.display();

        try {
            System.out.println("Popped: " + q.delete()); // Should remove and return 50
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }         

        q.display();
    }
}
