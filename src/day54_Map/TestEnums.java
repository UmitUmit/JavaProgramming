package day54_Map;

public class TestEnums {
    public static void main(String[] args) {

        String browserName = "Cybertek";

        Browsers browserName2 = Browsers.FireFox;

        switch (browserName2){
            case Chrome:
                System.out.println("Chrome is selected");
                break;

            case FireFox:
                System.out.println("Fire fox is selected");
                break;

            default:
                System.out.println("Safri");
        }




    }
}
