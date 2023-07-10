package Animals;

 abstract class Animal{
     public void loves(){
         System.out.println("Animal loves you ");
     }
     public void kisses(){
         System.out.println("Animal kisses  you ");
     }
     abstract void maintain();
     abstract void care();
}
 class dog extends Animal{
     public void maintain(){
         System.out.println("Maintained ");
     }
     public void care(){
         System.out.println("They care about you ");
     }
 }
class MainClass{
    public static void main(String[] args) {
        Animal d= new dog();
        d.loves();
        d.kisses();
        d.maintain();
        d.care();

    }
}