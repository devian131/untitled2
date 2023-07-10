package examA;


import java.util.Scanner;



public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numString = input.nextLine();
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            sum += digit;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
