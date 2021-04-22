package bootCamp;

class BasePage{

    public BasePage(){
        System.out.println("InitElements(driver, this)");
    }

}

class LogIn extends BasePage{

}

class HomePage extends BasePage{


}



public class Inheritance {

    public static void main(String[] args) {

        new LogIn();
        new HomePage();

    }

}


class TestBase{

    /*
    setUp
     */


    /*
    tearDown
     */

}


