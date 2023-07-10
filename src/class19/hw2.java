package class19;

public class hw2 {
    public static void main(String[] args){
         int sum=0;
         for(int num=1; num<=10; num++){
             if (num%2==0){

                 System.out.println(num);
                 sum=num+sum;
             }
         }
        System.out.println("The sum is  "+sum);
    }
}
