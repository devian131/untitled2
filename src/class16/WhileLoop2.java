package class16;

public class WhileLoop2 {

    public static void main(String[] args) {
        String a = "*";
        while (a.length() < 6) {
            System.out.println(a);
            a += "*";
        } //write a program that will print out even numbers until 20(Arthur code)
        int num = 2;
        while (num < 20) {
            System.out.println(num);
            ++num;
            ++num;


        }
        //Askar code but it gives me 22 as well
        int num1 = 0;
        while (num1 <= 20) {
            num1 += 2;
            System.out.println(num1);
//space complexity, time complexity, big annotation
        }

        int i = 1;
        while (i < 6) {
            System.out.println("Lala");
            i++;
        }
        int c = 1;
        while (c < 5) {
            System.out.println("Bro");
            c++;

        }


    }
}









//write a program that will count vowel characters
//and consonant characters in a string
// String str="Hello DevXer";
//4 vowels
//9 consonants including the space


