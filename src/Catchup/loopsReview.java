package Catchup;

import java.util.Scanner;

public class loopsReview {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the population of the city: ");
        int population = keyboard.nextInt();
        while(population<0){
            System.out.println("Please enter the positive number ");
            break;
        }
    }
}