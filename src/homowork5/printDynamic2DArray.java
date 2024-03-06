package homowork5;

import java.util.Scanner;

public class printDynamic2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows of Array: ");
        int row = scanner.nextInt();

        System.out.print("Enter the number of columns of Array: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element [" + (i+1)+ "][" + (j+1) + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
