package homowork5;

import java.util.Scanner;
public class sumArrayElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of Array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int arrNum : array) {
            sum = sum + arrNum;
        }

        System.out.print("Sum of all array elements = " + sum);
    }
}
