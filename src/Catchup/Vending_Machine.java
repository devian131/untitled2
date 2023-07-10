package Catchup;
import java.util.Scanner;
public class Vending_Machine {
    public static void main(String[] args) {
        int originalAmount, amount, quarters, dimes, nickels, pennies;
        System.out.println("Enter a whole number from 1 to 99");
        System.out.println("I will find a combination of coins ");
        System.out.println("that equals that amount of change");
        Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();
        originalAmount = amount;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;

        System.out.println(originalAmount + "cents in coints can be given us: ");
        System.out.println(quarters + " quarters ");
        System.out.println(dimes + " dimes ");
        System.out.println(nickels + " nickels and ");
        System.out.println(pennies + " pennies ");

    }

}
