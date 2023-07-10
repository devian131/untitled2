package Class22;

import java.util.Scanner;

public class HW0207 {
    public static void main(String[] args){
        int listOfData[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");
        for (int i = 0; i < listOfData.length; i++) {
            listOfData[i] = sc.nextInt();
        }
        int revListOfData[] = new int[5];
        for (int i = 0; i < listOfData.length; i++) {
            revListOfData[listOfData.length - 1 - i] = listOfData[i];
        }for (int i = 0; i < revListOfData.length; i++) {
            System.out.print(revListOfData[i] + " ");
        }
         }

        }


