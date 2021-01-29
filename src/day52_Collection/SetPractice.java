package day52_Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        Set<String> names1 = new HashSet<>();
        names1.addAll(Arrays.asList("Daniel","Ruslan" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names1);

        System.out.println("=================================================");

        Set<String> names2 = new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Daniel","Ruslan" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names2);

        System.out.println("=============================================");
        Set<String> names3 = new TreeSet<>();
        names3.addAll(Arrays.asList("Daniel","Ruslan" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names3);

        System.out.println("====================================================");

        String str = "gggaaabbbccc";  // gabc
        String result = "";
        /*
        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += s;
        }
         */

     //   String[] arr = str.split("");  // [g, g, g, a, a, a, b, b, b, c, c, c]

        LinkedHashSet<String> hs = new LinkedHashSet<>( Arrays.asList( str.split("") )  );  // [g, a, b, c]

        for (String each : hs) {
            result += each;
        }

        // System.out.println(hs.get(0));

        System.out.println(result);

        System.out.println("=======================================================");

        String str1 = "silent";
        String str2 = "listen";

        String s1 = new TreeSet<>(  Arrays.asList( str1.split("") ) ).toString()  ;
        String s2 =  new TreeSet<>(  Arrays.asList( str2.split("") ) ).toString()  ;

        System.out.println(s1.equals(s2));













    }

}
