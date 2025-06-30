import java.util.Scanner;
class stack_link {
   static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }


    }
    node top=null;
   public void push(Scanner sc){
       System.out.print("Enter the data");
       int data=sc.nextInt();
       node newnode=new node(data);
       if(top==null){
           top=newnode;

       }
       else{
           newnode.next=top;
           top=newnode;
       }

   }
   public void pop(){
       if(top==null){
           System.out.println("The stack is empty");
       }
       else{
           top=top.next;

       }
   }
   public void display(){
       node temp=top;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
   }

}





public class stack_linkeedlist {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            stack_link obj = new stack_link();
            int m;
            do {
                System.out.println("1.push 2.pop 3.display");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        obj.push(sc);
                        break;
                    case 2:
                        obj.pop();
                        break;
                    case 3:
                        obj.display();
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
                System.out.println("Do you want to continue 1.yes 2.no");
                m = sc.nextInt();

            }while(m==1);

        }
    }

