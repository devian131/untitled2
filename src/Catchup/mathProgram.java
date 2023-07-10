package Catchup;

import java.util.Scanner;

public class mathProgram {
    public static void main(String[] args){
        int num1;
        int num2;
        int result=1;
        System.out.println("Please enter 2 numbers ");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        num2= sc.nextInt();
        while(num2>0){
            result*=num1;
            num2--;
        }
        System.out.println("Result is "+result);
    }
}
