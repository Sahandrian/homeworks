package homowork5;

import java.util.Arrays;
import java.util.Scanner;

public class stringPalindromCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string to be checked: ");
        String str = scanner.nextLine();

        char[] array = str.toLowerCase().toCharArray();
        char[] arrayRev = Arrays.copyOf(array, array.length);

        for (int i = 0; i < arrayRev.length / 2; i++) {
            char temp = arrayRev[i];
            arrayRev[i] = arrayRev[arrayRev.length - i - 1];
            arrayRev[arrayRev.length - i - 1] = temp;
        }

        if (Arrays.equals(array, arrayRev)) {
            System.out.println("Entered string is a palindrome: " + str);
        } else {
            System.out.println("Entered string is NOT a palindrom: " + str);
        }
    }
}