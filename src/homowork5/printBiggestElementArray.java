package homowork5;

import java.util.Scanner;

public class printBiggestElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of Array: ");
        int n = scanner.nextInt();
        int bigNum;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        bigNum = array[0];

        for (int i = 0; i < n; i++) {
            if (bigNum <= array[i]) {
                bigNum = array[i];
            }
        }

        System.out.print("Biggest number in the array is " + bigNum);

    }
}
