package linkedlist_traversal;

import java.util.Scanner;

public class LinkedList_Traversal {

    public static void main(String[] args) {     
        Scanner scan = new Scanner(System.in);
        Link link = new Link();

        System.out.println("Linked List 1 :");
        char again;
        do {
            System.out.print("Input : ");
            char data = scan.next().charAt(0);
            link.addFirst(data);
            System.out.print("Again ?");
            again = scan.next().charAt(0);
        } while (again != 'x');

        System.out.println("Print Linked List 1 : ");
        link.show();
        
        System.out.println("Print Linked List 2 : ");
        link.addTraversalFirst();
        link.newShow();
        
        
    }
}
