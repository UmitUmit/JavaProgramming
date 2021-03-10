package Office_Hour_Recordings.Maps2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for(String eachWord : strings) {
            map.put( eachWord.substring(0,1), eachWord.substring(eachWord.length()-1));
        }

        return map;
    }

}
