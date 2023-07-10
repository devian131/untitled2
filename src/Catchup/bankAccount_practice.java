package Catchup;

import java.util.Scanner;

public class bankAccount_practice {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int balance;
        System.out.println("Please enter your balance");
        balance= sc.nextInt();
        if(balance>0){
            System.out.println("Positive balance");
        }
        else if(balance<0){
            System.out.println("Negative Balance");
        }
        else if(balance==0){
            System.out.println("Balance is zero");
        }
    }
}
