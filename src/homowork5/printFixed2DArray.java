package homowork5;

import java.util.Scanner;

public class printFixed2DArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[4][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element [" + (i+1)+ "][" + (j+1) + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }

    }
}
