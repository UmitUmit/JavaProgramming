package day54_Map;

import java.time.LocalDate;
import java.util.*;

public class ListOfMap2 {

    public static void main(String[] args) {
        String[] familyMember = {"John","Kevin","Lik"};
        LocalDate[] DOBFamilyMember = {LocalDate.of(1992,01,02),LocalDate.of(1993,01,03),LocalDate.of(1994,01,04)};

        String[] classMates = {"Jerry","Karim","Merk","Clark"};
        LocalDate[] DOBClassMates = {LocalDate.of(1995,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};

        String[] friends = {"Erik","Kahri","Morh","Jonny"};
        LocalDate[] DOBFriends = {LocalDate.of(1997,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};


        List<Map<String, LocalDate>> listOfMap = new ArrayList<>();
        listOfMap.addAll(Arrays.asList(
                new LinkedHashMap<>(),  // for family members
                new LinkedHashMap<>(),  // class mates
                new LinkedHashMap<>()  // friends
        ) );

        for(int i = 0;  i < familyMember.length; i++){
            listOfMap.get(0).put( familyMember[i],  DOBFamilyMember[i] );
        }

        for(int i = 0; i < classMates.length; i++){
            listOfMap.get(1).put(classMates[i], DOBClassMates[i]);
        }

        for(int i = 0; i < friends.length; i++){
            listOfMap.get(2).put(friends[i], DOBFriends[i]);
        }

        System.out.println(listOfMap);

        System.out.println("=============================================");

        for (Map.Entry<String, LocalDate> each : listOfMap.get(0).entrySet()) {
            String eachName = each.getKey();
            LocalDate eachDOB = each.getValue();

            if(eachDOB.isBefore(LocalDate.of(1994,1,1))){
                System.out.println(eachName);
            }
        }


        System.out.println("===========================================================");
        String[] modelOfToyota = {"Camry","Rav4","Corolla","Land Cruiser"};
        Integer[] yearOfToyota = {2001, 2011, 2015, 2021};
        String[] modelOfBMW = {"M1","M3","M5","X5"};
        Integer[] yearOfBMW = {1995, 2005, 2015, 2020};
        String[] modelOfMercedes = {"C-Class","A-Class","SLS","GLC"};
        Integer[] yearOfMercedes = {1990, 1995, 2015, 2021};


        List<Map<String, Integer>> carCollection = new ArrayList<>();
        carCollection.addAll(
                    Arrays.asList(
                            new TreeMap<>(),  // for mercedes
                            new TreeMap<>(), // for toyota
                            new TreeMap<>() // for BMW
                    )
        );


        /*
        eligible to recall:
            BMW:
                2011 - 2015

            Mercedes:
                1990 - 1998

            Toyota:
                1960 - 1970
         */







    }


}
