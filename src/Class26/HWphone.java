package Class26;

public class HWphone {
    String brandname;
    int memory;
    boolean camera;
    void makeCall(String brandname){
        System.out.println(brandname+"Is calling");
    }
    void makeSurf(int memory){
        if(memory>64){
            System.out.println(brandname+"can surf in the net");
        }
        else {
            System.out.println(brandname+"can not surf in th net");
        }
    }


    void takePicture(boolean camera){
        if(camera){
            System.out.println(brandname+"is taking picture ");
        }
        else {
            System.out.println(brandname+"can not take picture ");
        }
    }
}
