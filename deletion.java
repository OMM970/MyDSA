import java.util.Scanner;
public class deletion {
    public static void main(String[] args) {
        System.out.println("Enter the sizeof array") ;
        Scanner sc=new  Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        int [] arr1=new int[size+1];
        System.out.println("Enter the array elements") ;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("array before deletion");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Enter the index ");
        int index=sc.nextInt();
        for(int i=0;i<size;i++){
            if (i<index){
                arr1[i]=arr[i];
            }
            else if(i==index){

                continue;
            }
            else{
                arr1[i-1]=arr[i];
            }
        }
        System.out.print("array after deletion");
        for(int i=0;i<size-1;i++){
            System.out.print(arr1[i]+" ");
        }




    }
}
