package examA;

class Parent  {
    public Parent(){
        System.out.println("From Base");

    }

}
class Child extends Parent{
    Child(){
        this("Hello ");
        System.out.println("Welcome ");
    }
    Child(String str){
        System.out.println(str);
    }
}
public class Question6{
    public static void main(String[] args) {
        Parent p=new Child();
    }

}
