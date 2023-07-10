class  grandparent {
    void loving(){
        System.out.println("They love grand kids");
    }
}
class parent extends grandparent{
    void takecare(){
        System.out.println("They take care of kids ");
    }
    void paybills(){
        System.out.println("They pay bills ");
    }
}
class child extends parent{
    void love(){
        System.out.println("They love everyone ");
    }
}
class Main {
    public static void main(String[] args) {
        child childObj = new child();
        childObj.love();
        childObj.takecare();
        childObj.paybills();
        childObj.loving();
    }
}

