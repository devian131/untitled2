package examA;

public class Question1 {
    public static void main(String[] args) {
        String value="abc";
        changeValue(value);
        System.out.println(value);
    }
    public static void changeValue(String a){
        a="xyz";
    }
}
