package bootCamp;

public class StringPractice {
    public static void main(String[] args) {

        String str = "Java";  // immutable
                 str.concat(" Language"); // "Java Language"

        System.out.println(str); // Java

        System.out.println("---------------------------------------------");
        StringBuilder sb1 = new StringBuilder("Java"); // mutable, "Java Language"
                sb1.append(" Language");

        StringBuffer sb2 = new StringBuffer("Java");
                sb2.append(" Language");

        System.out.println(sb1);
        System.out.println(sb2);




    }
}
