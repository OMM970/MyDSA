package java_class;
import java.util.Scanner;

public class Dimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row ");
        int r = sc.nextInt();
        System.out.println("Enter the size of the column ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }
            for (i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        }

    }
}


