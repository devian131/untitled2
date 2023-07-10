package practiceProblems;

import java.util.Scanner;

public class lopsStuff {
    public static void main( String [] args){
        int number, count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number ");
        number= sc.nextInt();
        count=1;
        do{
            System.out.println(count+" ");
            count++;
        }
        while(count<=number);
        System.out.println("Buckle my shoe ");
    }
}
