package Office_Hours.Practice_03_10_2021;

import java.util.*;

public class ListOfMap {

    public static void main(String[] args) {
        String[] namesGroup1 = {"Oliver", "Jack", "Noah", "Breanna", "Shay","James", "Conor", "Jake", "John"};
        Integer[] salariesGroup1 = {11000, 105000, 95000, 85000, 100000, 90000, 78000, 118000, 98000};
        HashMap<String, Integer> group1 = new HashMap<>();


        String[] namesGroup2 = {"Harry", "Callum", "Mason", "Robert", "Keyle", "Isabella", "Mary", "Joe"};
        Integer[] salariesGroup2 = {88000, 94000, 104000, 108000, 98000, 105000, 85000, 100000};
        LinkedHashMap<String, Integer> group2 = new LinkedHashMap<>();


        String[] namesGroup3 = {"Bethany", "Emily", "Susan", "Smith", "Murphy" };
        Integer[] salariesGroup4 = {125000, 100000, 115000, 95000, 85000};
        TreeMap<String, Integer> group3 = new TreeMap<>();


        List<Map<String, Integer>> maps = new ArrayList<>();  // add all the groups into the list of map


    }
}
