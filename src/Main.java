import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        WhileLoopFun fun = new WhileLoopFun();
        System.out.println("-- test factorial --");
        System.out.println(fun.factorial(6));
        System.out.println(fun.factorial(10));
        System.out.println(fun.factorial(20));
        System.out.println("-- test printDigits --");
        fun.printDigits(5);
        System.out.println("--");
        fun.printDigits(361);
        System.out.println("--");
        fun.printDigits(150856);
        System.out.println("-- test sumOfDigits --");
        System.out.println(fun.sumOfDigits(80));
        System.out.println(fun.sumOfDigits(361));
        System.out.println(fun.sumOfDigits(150856));
        System.out.println("-- test isPrime --");
        System.out.println(fun.isPrime(2));
        System.out.println(fun.isPrime(13));
        System.out.println(fun.isPrime(14));
        System.out.println(fun.isPrime(30));
        System.out.println(fun.isPrime(1));
        System.out.println("-- test maxDoubles --");
        System.out.println(fun.maxDoubles(4, 20));
        System.out.println(fun.maxDoubles(2, 65));
        System.out.println(fun.maxDoubles(5, 500));
        System.out.println(fun.maxDoubles(2, 64));
        System.out.println(fun.maxDoubles(2, 63));
        System.out.println(fun.maxDoubles(8, 10));
        System.out.println(fun.maxDoubles(8, 5));
    }

}