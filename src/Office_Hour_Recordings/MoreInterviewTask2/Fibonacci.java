package Office_Hour_Recordings.MoreInterviewTask2;

public class Fibonacci {

    // 0 1 1 2 3 5 8

    public static void main(String[] args) {
       // fib(9);
        System.out.println(fibonacci(7));
    }

    public static void fib(int num) {

        int a = 0;
        int b = 1;
        System.out.print(a);

        for(int i= 1; i <= num; i++) {
            System.out.print(" " + b);
            int next = a + b;
            a = b;
            b = next;
        }

    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);

    }



}
