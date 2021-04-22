package bootCamp;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapEntryExample {

    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();
        
        for( Map.Entry<String, String> entry: map.entrySet() ){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }


        for (String value : map.values()) {
            
        }

        for (String key : map.keySet()) {
            
        }
        
        
    }
    
}
