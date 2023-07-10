package Class26;

public class HWPhoneMainclass {
    public static void main(String[] args){
        HWphone phone1=new HWphone();
        HWphone phone2=new HWphone();
        HWphone phone3= new HWphone();

        phone1.brandname="Iphone";
        phone1.memory=256;
        phone1.camera=true;

        phone2.brandname="Samsung";
        phone2.memory=256;
        phone2.camera=true;

        phone3.brandname="Xiaomi";
        phone3.memory=16;
        phone3.camera=false;

        phone1.makeCall(phone1.brandname);
        phone2.makeCall(phone2.brandname);
        phone3.makeCall(phone3.brandname);


        phone1.makeSurf(phone1.memory);
        phone2.makeSurf(phone2.memory);
        phone3.makeSurf(phone3.memory);

        phone1.takePicture(phone1.camera);
        phone2.takePicture(phone2.camera);
        phone3.takePicture(phone3.camera);
    }
}
