package Catchup;

import java.util.Scanner;

public class additionalex {
    public static void main(String[] args) {
        int speed;
        int visibility;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your speed and visbility conditions");
        speed = sc.nextInt();
        visibility = sc.nextInt();
        if (speed > 25 && visibility<20) {

            System.out.println("Caution");

        }

    }
}