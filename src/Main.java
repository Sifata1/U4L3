import java.util.Scanner;

public class Main {
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



    }


}

