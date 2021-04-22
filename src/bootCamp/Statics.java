package bootCamp;

class A{
    static int a = 10;
    int b = 20;

}


public class Statics {

    public static void main(String[] args) {

        System.out.println(A.a);

        System.out.println(new A().b);

        A.a = 30;

        A obj1 = new A();
        A obj2 = new A();

        obj1.b= 100;

        System.out.println(obj1.a);
        System.out.println(obj2.a);

        System.out.println(obj1.b);
        System.out.println(obj2.b);

    }

}
