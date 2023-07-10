package class16;

public class HW16 {
    public static void main(String[] args){
        int odd=1;
        while(odd<=20){
            System.out.println(odd+" ");
            odd+=2;
        }
        int num1=0;
        int sum=0;
        while(num1<=10){
            sum+=num1;
            num1++;
        }
        System.out.println("The sum is "+sum);

        int N=7;
        int range=10;
        int i= 1;
        while (i<=range){
            System.out.println(N+"*" + i+ "=" + N*i);
            i++;
    }
}
}