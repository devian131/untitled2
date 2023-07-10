package Catchup;

import java.util.Scanner;
public class array_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {32, 45, 53, 65, 43, 23};
        System.out.print("Enter the number: ");
        int numberToBeFound = sc.nextInt();

        boolean isPresent = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToBeFound) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("PRESENT");
        } else {
            System.out.println("NOT PRESENT");
        }
    }
}
