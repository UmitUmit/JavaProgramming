package Office_Hours.Practice_03_10_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Level", "Car", "Anna", "Nalan", "Java"));

       /*
        words.removeIf( p ->  isPalindrome(p) );
        */

        for( Iterator<String> it = words.iterator();  it.hasNext();  ){

            if( isPalindrome(it.next()) ){
                it.remove();
            }

        }

        System.out.println(words);

        System.out.println("===================================");

        List<String> words2 = new ArrayList<>(Arrays.asList("Level", "Car", "Anna", "Nalan", "Java"));

        Iterator<String> it = words2.iterator();

        while(it.hasNext()){
            String each = it.next();

            String reverse = "";
            for(int i = each.length()-1; i >= 0; i--)
                reverse += each.charAt(i);

            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }


        }


        System.out.println(words2);







    }

    public static boolean isPalindrome(String str){
       // return  new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--)
            reverse += str.charAt(i);

        return reverse.equalsIgnoreCase(str);
    }


}
