package Class22;

import java.util.Scanner;

public class legnthofEachString {
    public static void main(String [] args){
        String names[]=new String[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 names ");
        for(int i=0; i<names.length; i++){//i can be used only inside only this for loop.
            names[i]= input.next();
        }
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]+"="+names[i].length());//It prints the lengh of each name
        }
    }
}

