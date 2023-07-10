package Student;

class page {
    void loadPage(){
        System.out.println("Page is loading ");
    }
    void isPageLoaded(){
        System.out.println("Is the page loaded ");
    }
    page(){
        this.loadPage();
    }
}
class LoginPage extends page{
    void dologin(){
        System.out.println("You succesfully logged in ");

    }
    void dolgout(){
        System.out.println("You successfully logged out ");
    }
}
class HomePage extends page{
    void openHomePage(){
        System.out.println("This is homepage");

    }
    void verifylogo(){
        System.out.println("Logo is verified ");
    }

}
class Main{
    public static void main(String[] args){
        LoginPage loginObj=new LoginPage();
        loginObj.dologin();
        loginObj.dolgout();
        HomePage homepageObj=new HomePage();
        homepageObj.openHomePage();
        homepageObj.verifylogo();
}
}
