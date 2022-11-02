import java.util.Scanner;
public class WhileLoopFun {
    /**
     * This class has no instance variables, so we can either include no constructor,
     * or this simple no-parameter constructor, which is actually preferred practice
     * over omitting the constructor entirely
     */
    public WhileLoopFun() {
    }

    /**
     * Performs the factorial operation on number (i.e. number!) and returns the result as a double
     * (returning a double rather than an int is intentional, as it allows for much larger results to be returned
     * than would be possible if returning an int, because with factorials, it is easy to quickly exceed
     * Integer.MAX_VALUE and get unexpected results).
     * Example:  If number is 6, this methods returns 6 * 5 * 4 * 3 * 2 * 1 = 720.0
     * Example:  If number is 10, this methods returns 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 362880.0
     * Example:  If number is 20, this methods returns 2.43290200817664E18 ≈ 2.43 x 1018
     */
    public double factorial(int number) {
        double x = number;
        double facTotal = x;
        while (x != 1) {
            x = x - 1;
            facTotal = facTotal * x;

        }
        return facTotal;
    }

    public void printDigits(int number) {
        String s = String.valueOf(number);
        int x = s.length();
        int y = 0;
        String digits = "";
        while (x != y) {
            digits = s.substring(x - 1, x);
            System.out.println(digits);
            x--;
        }
    }

    public int sumOfDigits(int number) {
        String s = String.valueOf(number);
        int x = s.length();
        int y = 0;
        int sum = 0;
        String digits = "";
        while (x != y) {
            digits = s.substring(x - 1, x);
            int total = Integer.parseInt(digits);
            sum = sum + total;
            x--;
        }
        return sum;
    }

    public boolean isPrime(int number) {
        int d = 2;
        boolean prime = true;
        while (d <= number / 2) {
            if (number % d == 0) {
                prime = false;
                d++;
            } else if (number % d != 0) {
                prime = true;
                d++;
            }
        }
        if (number == 1) {
            prime = false;
        }
        return prime;
    }


    public int maxDoubles(int number, int threshold) {
        int d = 0;
        while (number <= threshold) {
            number = number * 2;
            if (number <= threshold) {
                d++;
            }
        }
        return d;
    }

    /* public void maxMin() {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int max = 0;
        int min = 0;
        while (x != -1) {
            System.out.print("Enter a number (or -1 to quit): ");
            x = s.nextInt();
            y = s.nextInt();
            if (x > max) {
                max =x;
                max = y;
            } else if (x<min) {
                min = x;
                min = y;
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        }


    }
    /*
     */

// if (x != -1) {
//                System.out.println(x);
//                System.out.print("Enter a number (or -1 to quit): ");
//                if (s.nextInt() > x) {
//                    max = s.nextInt();
//                }
//                if (s.nextInt() < x) {
//                    min = s.nextInt();
//                }
//                x = s.nextInt();
//            }

/* int max = 0;
        int min = 0;
        System.out.print("Enter a number (or -1 to quit): ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(x);
        while (x != -1) {
            System.out.print("Enter a number (or -1 to quit): ");
            int y = s.nextInt();
            if (y > max) {
                y = max;
            } else if (y < min) {
                y = max;
            }
            x = s.nextInt();

        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        */

/*   if (x == -1) {
            System.out.println("You did not enter any numbers!");
        } else {
            while (x != -1) {
                System.out.print("Enter a number (or -1 to quit): ");
                x = s.nextInt();
                if (x > max) {
                    max =x;
                } else if (x<min) {
                    min = x;
                }
            }
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);
        }

 */

    public static void maxMin() {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        int d = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.print("Enter a number (or -1 to quit): ");
        x = s.nextInt();
        if (x == -1) {
            System.out.print("You did not enter any numbers!");
        } else if (x != -1) {
            while (x != -1) {
                System.out.print("Enter a number (or -1 to quit): ");
                x = s.nextInt();
                if (x != -1) {
                    if (x < min) min = x;
                }

                if (x > max) {
                    max = x;
                }
            }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }

    public static void RunningAverage() {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        int d = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.print("Enter a number (or -1 to quit): ");
        x = s.nextInt();
        if (x == -1) {
            System.out.print("You did not enter any numbers!");
        } else if (x != -1) {
            while (x != -1) {
                System.out.print("Enter a number (or -1 to quit): ");
                sum = sum + x;
                d++;
                x = s.nextInt();
            }
            System.out.println(sum);
        }

    }
}