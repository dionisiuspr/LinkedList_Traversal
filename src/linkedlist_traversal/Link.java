package linkedlist_traversal;

public class Link {

    Node head;
    NewNode newHead;

    public void addFirst(char data) {
        Node temp = new Node();
        temp.info = data;
        temp.next = null;

        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }
    
    public void addTraversalFirst() {
        Node temphead = this.head;
        while (temphead != null) {
            NewNode temp = new NewNode();
            temp.info = temphead.info;
            temp.next = null;

            if (newHead == null) {
                this.newHead = temp;
            } else {
                temp.next = this.newHead;
                newHead = temp;
            }
            temphead = temphead.next;
        }
    }

    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            while (temp != null) {
                System.out.print(temp.info + "->");
                temp = temp.next;
            }
        }
    }

    public void newShow() {
        NewNode temp = newHead;
        if (newHead == null) {
            System.out.println("The list is empty!");
        } else {
            while (temp != null) {
                System.out.print(temp.info + "->");
                temp = temp.next;
            }
        }
    }
}
