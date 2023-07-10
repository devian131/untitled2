package Catchup;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // first come declarations
        int numberOfBaskets, eggsPerBasket, totalEggs;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of eggs in each basket");
        eggsPerBasket = keyboard.nextInt();
        System.out.println("Enter the number of baskets");
        numberOfBaskets = keyboard.nextInt();
        totalEggs = numberOfBaskets * eggsPerBasket;
        System.out.println("Total eggs " + totalEggs);

        String test = "abcdefg";
        System.out.println(test.length());
        System.out.println(test.charAt(1));
        System.out.println(test.substring(3));
        System.out.println("abc\\ndef");
        String apple = "Hello JOhn";
        System.out.println(apple.toUpperCase());
        System.out.println(apple);




        }
    }




