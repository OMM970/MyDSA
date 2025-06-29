package linked_list;

import java.util.Scanner;

public class deletion {
      static class node {
          int data;
          node next;

          node(int data) {
              this.data = data;
              this.next = null;
          }

      }

      node head = null;

      public void creation() {
          Scanner sc = new Scanner(System.in);
          int data, m;
          do {
              System.out.print("Enter number of items: ");
              data = sc.nextInt();
              deletion.node new_node = new deletion.node(data);
              if (head == null) {
                  head = new_node;
                  new_node = head;

              } else {
                  new_node.next = head;
                  head = new_node;
              }
              System.out.print("do you want to enetr more 1)yes 0)no ");
              m = sc.nextInt();
          }
          while (m == 1);


      }

      public void traverse() {
          node temp = head;
          if (head == null) {
              System.out.print("the list is empty");

          } else {
              while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
              }
          }

      }

      public void delete() {
          int data, input, position,m;
          Scanner sc = new Scanner(System.in);

          do {
              if (head == null) {
                  System.out.print("The list is empty");

              } else {
                  System.out.print("enter the linked_list.deletion option 1.Begining 2.middle 3.end");
                  input=sc.nextInt();
                  switch(input){
                      case 1:
                          node temp = head;
                          temp=temp.next;
                          head=temp;
                          break;
                          case 2:
                              node temp1=head;
                              node ptr=temp1.next;
                              while(ptr!=null){
                                  temp1=ptr;
                                  ptr=ptr.next;

                              }
                              temp1.next=null;
                              break;
                              case 3:
                                  System.out.println("enetr the postion to bve deleted");
                                  position=sc.nextInt();
                                  node temp2=head;
                                  node ptr1=temp2.next;
                                  for (int i=0;i<position-2;i++){
                                      temp2=ptr1;
                                      ptr1=ptr1.next;


                                  }
                                  temp2=temp2.next;
                                  break;




                  }

              }System.out.print("Do you want to delete more 1)yes 0)no ");
              m=sc.nextInt();

          }
          while(m==1);

      }
      public static void main(String[] args) {
          deletion obj = new deletion();
          obj.creation();
          obj.delete();
          obj.traverse();
      }
  }





