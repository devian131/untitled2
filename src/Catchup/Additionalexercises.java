package Catchup;

import java.util.Scanner;

public class Additionalexercises {
    public static void main(String[] args) {
        int goals;
        int errors;
        System.out.println("Please enter the values of errors and goals");
        Scanner sc = new Scanner(System.in);
        goals = sc.nextInt();
        errors= sc.nextInt();
        if (goals > 10 && errors == 0) {
            System.out.println("wow");
        } else {
            System.out.println("Well, ok ");
        }
    }
}


