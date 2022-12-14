package Office_Hour_Recordings.MoreInterviewTask2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {

        // {([])}

        // ( { } ) ]

    public static void main(String[] args) {
        System.out.println(isBalanced("{([])"));
    }

    public static boolean isBalanced(String str) {

        String open = "{[(";
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');

        for(int i=0; i < str.length(); i++) {

            if(open.contains("" + str.charAt(i))) {
                // This char is some opening bracket

                stack.push(str.charAt(i));

            } else {
                // This char is some closing bracket

                if( stack.isEmpty() || str.charAt(i) != map.get( stack.pop() )) {  // ] != ]
                    return false;                                                   // ) != )
                }

            }

        }

        return stack.isEmpty();

    }


}
