package Car;

 public abstract class Car {
    public void drives(){
        System.out.println("Car can drive ");
    }
    abstract void color();
    static public void brand(){
        System.out.println("Brand of the car ");
    }
}
class Toyota extends Car{
    @Override
    void color() {
        System.out.println("Car is white ");
    }

    @Override
    public void drives() {
        System.out.println("CAr is driven ");
    }
   static public void brand(){
       System.out.println("Branding of the car ");
   }
}
class MainClass{
    public static void main(String[] args) {
     Toyota c= new Toyota();
     c.drives();
     c.color();
     c.brand(); 
    }
}
