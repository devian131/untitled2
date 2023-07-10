package HWs;
class vehicle {
    public void drive(){
        System.out.println("Vehicle driving");
    }
}
class Car extends vehicle{
    public void drive() {
        System.out.println("Car driving");
    }
}
class Question3{
    public static void main(String[] args) {
        vehicle c=new Car();
        c.drive();
    }
}