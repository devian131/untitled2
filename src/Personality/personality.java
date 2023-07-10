package Personality;


class Person{

    private String name;
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
  class personality{
    public static void main(String[] args) {
        Person b= new Person();
        b.setName("Joe Rogan");
        b.setAge(55);
        System.out.println("My name is"+b.getName());
        System.out.println("I am "+b.getAge());
    }
}

