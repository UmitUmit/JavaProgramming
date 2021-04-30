package bootCamp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String str = "I love Java, Java is fun languageJavaJava";
        String word = "Java";
        int count =0;
        for(int i = 0; i <= str.length()-4; i++){
            if(word.equals( str.substring(i,i+4))){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("---------------------");

        String str2 = "javajavajava";
        int count2 = 0;
        while(str2.contains("java")){
            str2 = str2.replaceFirst("java", "");
            count2++;
        }

        System.out.println(count2);

    }
}


class frequencyOfCharacters{
    public static void main(String[] args) {
        String str = "aaabb";


        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(!result.contains(str.charAt(j)+"")) {
                result += str.charAt(j) + "" + count;
            }
        }


        System.out.println(result);


    }
}

class Divide{

    public static void main(String[] args) {
        int num1 = 101;
        int num2 = 20;

        if (num2 == 0) {
            System.out.println("Invalid Number");

        }else {

            int count = 0;
            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }
            System.out.println(count + " and remainder is " + num1);
        }
    }



}


class Calculator{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;

        while(true){
            System.out.println("Enter a number");
            int n1 = scan.nextInt(); // 9

            System.out.println("Enter a number");
            int n2 = scan.nextInt(); // 10

            result = n1 + n2;
            System.out.println("result = " + result);

            scan.nextLine(); // EnterEnter

            System.out.println("Would you like to continue?");
            String a = scan.nextLine().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){ // while the answer is invalid (yes or no)
                System.out.println("Invalid Entry, Please Re-Enter");
                System.out.println("Would you like to continue?");
                a = scan.nextLine().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }



    }
}

class RoomReservation{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;

        while (true) { // YES NO yeS nO Yes

            System.out.println("Which bedroom do you want to reserve?");
            String bedType = scan.next().toLowerCase();  // king, queen, single, king bed

            switch (bedType) {
                case "king":
                    totalPrice += 120;  // totalPrice = totalPrice + 120
                    break;
                case "queen":
                    totalPrice += 100;
                    break;
                case "single":
                    totalPrice += 80;
                    break;
                default:
                    System.out.println("Invalid room type");
            }

            scan.nextLine();
            System.out.println("Do you want to reserve another room?");
            String a = scan.nextLine();

            while( !(a.equals("yes") || a.equals("no")) ){ // while the answer is invalid (yes or no)
                System.out.println("Invalid Entry, Please Re-Enter");

                a = scan.nextLine().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }

        System.out.println("total price: " + totalPrice);
    }
}


