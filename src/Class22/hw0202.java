package Class22;

import java.util.Scanner;

public class hw0202 {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int numbersReverse[] = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbersReverse[numbers.length - 1 - i] = numbers[i];
        }
        for (int i = 0; i < numbersReverse.length; i++) {
            System.out.print(numbersReverse[i] + " ");
        }
    }
}
//int revListOfData[] = new int[5];
//for (int i = 0; i < listOfData.length; i++) {
//    revListOfData[listOfData.length - 1 - i] = listOfData[i];
//}for (int i = 0; i < revListOfData.length; i++) {
//    System.out.print(revListOfData[i] + " ");
//}