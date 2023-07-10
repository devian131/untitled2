package Class22;

import java.util.Scanner;

public class trainingClasses {
    // write a program which lets user to input 3 fruits and you print them again
    public static void main(String[] args){
        String names[]= new String[3];
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter 3 fruits ");
        for(int i=0; i< names.length; i++){
            names[i]= sc.next();
        }
        for(int i=0; i<names.length; i++){
            System.out.println("Your fruits are"+names[i]);
        }
    }
}
