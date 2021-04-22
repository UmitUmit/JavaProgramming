package bootCamp;

import java.util.Map;

class A{
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {

    }

    static {

    }

    static class AA{
        static int z = 30;
    }

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

        System.out.println(A.AA.z);



    }

}


class B{

    int a = 100;

    public void method(){

    }

    {

    }



}


class C{

    static {  // 1 time
        System.out.println("Static Block");
    }

    public C(){ //2
        System.out.println("Constructor");
    }

    { // 2
        System.out.println("Init");
    }



    public static void main(String[] args) {
        new C();
        new C();
    }





}

 class D{



}
