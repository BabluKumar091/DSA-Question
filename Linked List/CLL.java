public class CLL {
    private Node head;
    private Node tail;

    // Constructor
    CLL() {
        head = null;
        tail = null;
    }

    // Insert a node
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head; // Circular reference
            return;
        }

        tail.next = node;
        node.next = head; // Circular reference
        tail = node;
    }

    // Delete a node
    public void delete(int val) {
        if (head == null) {
            // List is empty
            return;
        }

        if (head.val == val) {
            // Special case: Deleting the head node
            if (head == tail) {
                // Only one node in the list
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head; // Update circular reference
            }
            return;
        }

        Node node = head;
        do {
            Node nextNode = node.next;
            if (nextNode.val == val) {
                node.next = nextNode.next;
                if (nextNode == tail) {
                    tail = node; // Update tail if deleted node was tail
                }
                break;
            }
            node = node.next;
        } while (node != head);
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("No data exist");
            return;
        }

        Node node = head;
        do {
            System.out.print(node.val + " -> ");
            node = node.next;
        } while (node != head);
        System.out.println("Head");
    }

    // Node class
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
