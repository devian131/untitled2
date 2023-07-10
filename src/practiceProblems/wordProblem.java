package practiceProblems;

import java.util.Scanner;

public class wordProblem {
    public static void main(String[] args) {
        int count, number;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        number= sc.nextInt();
        count=1;
        while(count<=number){
            System.out.print(count+" , ");
            count++;
        }

        System.out.println("Buckle my shoe ");
    }
}
