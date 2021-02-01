package day53_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MapPractice2 {

    public static void main(String[] args) {
       TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Mohammad", 99);
        scores.put("Hoshang", 98);
        scores.put("Jawad", 82);
        scores.put("Munir", 64);
        scores.put("Akbar", 74);
        scores.put("Spu", 95);
        scores.put("Simona",83);
        scores.put("Pedro",81);

        scores.replace("Mohammad", 79);

        List<String> earlyBirds = new ArrayList<>();  // >= 80
        List<String> angryBirds = new ArrayList<>(); // <= 80

      //  scores.keySet().forEach( p -> { if(scores.get(p) >= 80) earlyBirds.add(p); else angryBirds.add(p); }  );

        for (String name : scores.keySet()) {
            int score = scores.get(name);
            if(score >= 80){
                earlyBirds.add(name);
            }else{
                angryBirds.add(name);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        System.out.println("============================================================");





    }

}


/*
Tasks:
	1. create a map that can contain student name and student' score
			put 5 of your friends names and thier scores
			print out the names of the students who made less than 80


	2. create a map that can contains name and Date Of Birth.
			put 5 of your classmates' names and thier date of birth
			print out the names of the students who were born before 1980 January 1st


	3. create a map that can contain names of counties and thier capitals
				use for each loop to print out all the capitals

 */
