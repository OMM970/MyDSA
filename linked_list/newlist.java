package linked_list;

import java.util.Scanner;

public class newlist {
    static class  node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }


    }
    node head=null;
    public void creation(){
        Scanner sc = new Scanner(System.in);
        int data,m;

        do{
            System.out.print("Enter number of items: ");
             data = sc.nextInt();
            node new_node = new node(data);
            if (head==null){
                new_node.next = head;
                head = new_node;
            }
            else{
                System.out.print("1)Enter the data at beginning 2)Enter the dat at the end 3)Enter the data at desire node");
                int a=sc.nextInt();
                switch(a){
                    case 1:
                        new_node = head;
                        head = new_node;

                    case 2:
                        node temp = head;
                        while(temp!=null){
                            temp = temp.next;
                        }
                        temp.next=new_node;


                    case 3:

                }
            }
            System.out.print("want to enter data 1)yes 0)no ");
             m= sc.nextInt();
        } while(m == 1);


    }
    public void traverse(){
        node tremp=head;
      if(tremp==null){
          System.out.println("list is empty");
      }
      else{
          while(tremp !=null){
              System.out.print(tremp.data+" ");
              tremp=tremp.next;


          }

      }

        }
     public static void main(String args[]){
        newlist obj=new newlist();
        obj.creation();
        obj.traverse();
     }
    }


