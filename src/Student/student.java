package Student;

public class student {
    private String studName;
    public void setName(String studentName){
        this.studName=studentName;
    }
    public String getName(){
        return studName;
    }
    private int studAge;
    public void setAge(int studAge){
        if(studAge>=18){
            this.studAge=studAge;
        }
        else System.out.println("Please enter student who is at least 18 years old");


    }
    public int getAge(){
        return studAge;
    }
    private double studGPA;
    public void setGPA(double studentGPA) {
        if (studentGPA >= 0) {
            this.studGPA = studentGPA;
        } else System.out.println("The new GPA value is not acceptable  please try again");
    }

    public double getGPA(){
        return studGPA;
    }
}
 class TestStudent{
     public static void main(String[] args) {
         student s1=new student();
         s1.setName("Ahmed");
         s1.setAge(19);
         s1.setGPA(4.0);
         System.out.println("Student name: "+s1.getName()+" "+"Student age: "+s1.getAge()+" "+"Student GPA: "+s1.getGPA());
     }
}
