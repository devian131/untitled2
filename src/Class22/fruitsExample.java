package Class22;



import java.util.Scanner;

public class fruitsExample {
    public static void main(String[] args) {
        String listOfString[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 names: ");

        for (int i = 0; i <listOfString.length; i++) {
            listOfString[i] = sc.next();
        }

        for (int i = 0; i < listOfString.length; i++) {
            System.out.println(listOfString[i] + "=" + listOfString[i].length());
        }
    }
}