package homowork5;

import java.util.Scanner;

public class sumArrayDiagonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows/columns of array: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element [" + (i+1)+ "][" + (j+1) + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int sumDiagonal = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumDiagonal = sumDiagonal + array[i][j];
                }
            }
        }

        System.out.print("Sum of array diagonal: " + sumDiagonal);

    }
}
