package Catchup;

import java.util.Scanner;

public class catchup {
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        number= sc.nextInt();
        if(number>10){
            System.out.println("High");
        }
        else if(number<5){
            System.out.println("Low");
        }
        else {
            System.out.println("so-so");
        }
    }
}
