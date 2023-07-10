package HWs;

import java.time.Period;

class person {
    public void eat(){
        System.out.println("Person is eating");
    }
}
class Student{
    public void eat(){
        System.out.println("Student is eating ");
    }
}
class Question2{
    public static void main(String[] args) {
        person p=new person();
        p.eat();
    }
}
