package class21;

public class examlpe2 {
    public static void main(String[] args){
        //Write a code that will print the following 1
        //                                           12
        //                                            123
        //                                            1234
        //                                             12345
        //How can I do it, I see that 1 is repeated 5 times, 2 four times, 3 three times, 4 two times, 5 one time
        // T
        for(int i=1; i<=5; i++){

            for(int j=1; j<=i; j++){
                System.out.println(j);
            }
            System.out.println();
        }
    }
}
