package Catchup;



import java.util.Scanner;

public class loops {
    public static void main(String[] args){
    //Write a Java loop that will read a list of numbers of type double and then
    //display their average. The numbers are all greater than or equal to 1.0. The
    //input data ends with a sentinel value, which you must specify. Also give
    //any declarations or initializing statements that are needed
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your values to quit enter negative value");
        double sum=0;
        double count=0;
        double num= sc.nextDouble();
        while(num>=0){
            sum+=num;
            count++;
            num= sc.nextDouble();
        }
        if(count>0){
            double avg=(double)sum/count;
            System.out.println("Your average is "+avg);
        }
        else {
            System.out.println("no numbers were entered ");
        }
    }
}
