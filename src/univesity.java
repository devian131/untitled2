 class univesity {
    void teach(){
        System.out.println("Chemistry");
    }
    void teach(String name){
        System.out.println("This is the name "+name);
    }
    void teach(int gpa){
        System.out.println("Your GPA");
    }
}
class MainClasss{
    public static void main(String[] args){
        univesity obj=new univesity();
        obj.teach();
        obj.teach(5);
        obj.teach("Sandra");


    }
}