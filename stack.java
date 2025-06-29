import java.util.Scanner;

class stack_array{
    int top=-1;
    int n=10;
    int [] ar=new int[n];
    void push(Scanner sc){
        if(top==n-1){
            System.out.println("stack overflow");
        }
        else{
            System.out.print("Enter the data ");
            int data=sc.nextInt();
           top=top+1;
            ar[top]=data;
            System.out.print("Data entered");

        }

    }
    void pop(){
        if(top==-1){
            System.out.print("stack underflow");
        }
        else{
            top=top-1;
            System.out.print("Data popped");
        }
    }
    void display(){
        System.out.println("Stack Contents of Stack are");
        for(int j=top;j>=0;j--){
            System.out.print(ar[j]+" ");
        }
    }

}


public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack_array obj = new stack_array();
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
