package Catchup;

import java.util.Scanner;

public class leap_Year {
    public static void main(String[] args){
        int startYear;
        int endDate;
        int leapYear=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the year you were born and year end");
        startYear= sc.nextInt();
        endDate= sc.nextInt();
        while(startYear<=endDate){
            if(startYear%4==0&&(startYear%100!=0||startYear%400==0))
            {
                leapYear++;
            }
      startYear++;
        }

        System.out.println("Number of leap years is "+leapYear);
    }
}
