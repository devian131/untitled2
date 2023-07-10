package Student;

 class Parent {
     void lifts(){
         System.out.println("Parent lifts 250Ibs");
     }
}
class Child extends Parent{
     @Override
     void lifts(){
         System.out.println("Child lifts 10Ibs");
     }
}
class MainSuper{
    public static void main(String[] args) {
        Child chilish=new Child();
        chilish.lifts();
    }
}