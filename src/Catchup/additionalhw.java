package Catchup;

import java.util.Scanner;

public class additionalhw {
    public static void main(String[] args){
        double salary;
        double bonus;
         final double MIN_SALARY=10000;
         final double  MIN_BONUS=2000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your salary and bonus");
        salary= sc.nextDouble();
        bonus= sc.nextDouble();
        if(salary>=MIN_SALARY||bonus>=MIN_BONUS){
            System.out.println("OK");
        }
        else {
            System.out.println("Too low");
        }

    }
}
