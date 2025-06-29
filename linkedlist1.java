import java.util.Scanner;

public class linkedlist1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        Scanner sc = new Scanner(System.in);
        int data, n;

        do {
            System.out.print("Enter the data: ");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }

            System.out.print("Do you want to enter more data? Yes-1 / No-0: ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked list is empty.");
        } else {
            System.out.println("Linked list elements are:");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // for newline
        }
    }

    public static void main(String[] args) {
        linkedlist1 ll = new linkedlist1();  // Create object
        ll.creation();                       // Call creation method
        ll.traverse();                       // Call traverse to print list
    }
}
