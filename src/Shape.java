class Shape {
    void draw(){
        System.out.println();
    }
    void erase(){
        System.out.println();
    }
}
class Cirlce extends Shape{
    void draw(){
        System.out.println("Drawing cirlce");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing square ");
    }
}
class ShapeMain{
    public static void main(String[] args){
        Cirlce c=new Cirlce();
        Square sc=new Square();
        c.draw();
        sc.draw();

    }
}