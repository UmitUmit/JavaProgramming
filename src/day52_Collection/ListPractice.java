package day52_Collection;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {
        // List (I): has index numbers, accepts duplicated objects

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));
        list1.removeIf(p -> p < 5);

        System.out.println(list1.get(4)); // Faster

        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));  // faster
        list2.removeIf( p -> p < 5); // faster

        System.out.println( list2.get(4));

        System.out.println(list2);



        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));
        list3.removeIf( p -> p < 5);

        System.out.println(list3);



        List<Integer> list4 = new Stack<>();


    }



    public synchronized void method1(){  // one thread at a time in multi-thread environment

    }

    public void method2(){

    }

}
