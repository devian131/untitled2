package class19;

import java.util.Scanner;

public class do_WhileLoops {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
        System.out.println("Please enter any number");
        int num= sc.nextInt();
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }

    }
}

