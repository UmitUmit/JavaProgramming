package Office_Hours.Practice_03_10_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstDuplicatedElement {
    // 1. Find the first duplicated element from the List
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,5,6,6,7,7));  // 3

        int result = 0;

/*
        for (Integer each : list) {
             int frequency = Collections.frequency(list, each);

             if(frequency > 1){
                 result = each;
                 break;
             }
        }

 */

        for (Integer each : list) {   // {1,2,3,3,4,4,5,5,6,6,7,7}

            int frequency = 0;

            for(Integer each2 : list){  // {1,2,3,3,4,4,5,5,6,6,7,7}   // for finding the frequency of an element
                if(each == each2){
                    frequency++;
                }
            }

            if(frequency > 1){  // == for finding first unique element
                result = each;
                break;
            }
        }


        System.out.println("result = " + result);



    }
}
