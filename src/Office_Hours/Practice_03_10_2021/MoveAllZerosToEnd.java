package Office_Hours.Practice_03_10_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,0,0,0, 0 ,4,3,2,3,0,2,0,1,0));  // [3,2,1,0,0,0]

        /*
        int totalNumberOfZeros = Collections.frequency(list, 0);  // 3

        list.removeAll(Arrays.asList(0));  // [3,2,1]

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
         */

        int originalSize = list.size();

        list.removeAll(Arrays.asList(0));

        int newSize = list.size();

        int totalNumberOfZeros = originalSize - newSize;
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list);

        System.out.println("===============================================");
        int[] array = {3,0,1,0,2,0};

        int[] newArray = new int[array.length];  //[0, 0, 0, 0, 0, 0]


        int count = 0;
        for (int each : array) {
            if(each != 0){
                newArray[count++] =each;
            }
        }


        /*
        for(int i = 0, j =0; i < array.length; i++){
            int each = array[i];
            if(each != 0){
                newArray[j++]=each;
            }
        }
         */

        System.out.println(Arrays.toString(newArray));


    }
}
