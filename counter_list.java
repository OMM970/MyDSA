import java.util.Scanner;

public class counter_list {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    node head = null;

    void creation() {
        Scanner sc = new Scanner(System.in);
        int m;
        do {
            System.out.print("Enter number of integers: ");
            int data = sc.nextInt();
            counter_list.node new_node = new counter_list.node(data);
            if (head == null) {
                head = new_node;
                new_node = head;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.print("want to enter more: 1)yes 2)no ");
            m = sc.nextInt();

        } while (m == 1);
    }

    void traverse()
    {
        int count = 0
        node temp = head;
        if (head == null) {
            System.out.println("There is nothing to traverse");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                count += 1;

            }
        }
        System.out.println("The numbner of nodes is "+count);
    }
    public static void main(String args[]){
        counter_list obj = new counter_list();
        obj.creation();
        obj.traverse();
    }

}