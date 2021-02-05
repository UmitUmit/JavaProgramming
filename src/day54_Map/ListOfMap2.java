package day54_Map;

import java.time.LocalDate;
import java.util.*;

public class ListOfMap2 {

    public static void main(String[] args) {
            String[] familyMember = {};
            LocalDate[] DOBFamilyMember = {};

            String[] classMates = {};
            LocalDate[] DOBClassMates = {};

            String[] friends = {};
            LocalDate[] DOBFriends = {};


        List<Map<String, LocalDate>> listOfMap = new ArrayList<>();
        listOfMap.addAll(Arrays.asList(
                new LinkedHashMap<>(),  // for family members
                new LinkedHashMap<>(),  // class mates
                new LinkedHashMap<>()  // friends
        ) );


        System.out.println(listOfMap);


    }


}
