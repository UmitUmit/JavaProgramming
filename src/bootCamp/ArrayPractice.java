package bootCamp;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,6};

        for(int i =0; i <= 4; i++){
            System.out.println( array1[i]  == array2[i]);
        }
        System.out.println("-------------------------");

       boolean r1 = Arrays.equals(array1, array2); // false
        System.out.println(r1);

       // ||,   &&

        System.out.println("-------------------------");
        int[] array3 = new int[3];
            array3[0] =1;
        //    array3[3] = 4;
        System.out.println(Arrays.toString(array3));
       //  [1, 0, 0]


        String str = null;

        System.out.println(str.toUpperCase()); //NULL


    }
}
