public class WhileLoopFun
{
    /**This class has no instance variables, so we can either include no constructor,
     or this simple no-parameter constructor, which is actually preferred practice
     over omitting the constructor entirely
     */
    public WhileLoopFun() { }

    /**Performs the factorial operation on number (i.e. number!) and returns the result as a double
     (returning a double rather than an int is intentional, as it allows for much larger results to be returned
     than would be possible if returning an int, because with factorials, it is easy to quickly exceed
     Integer.MAX_VALUE and get unexpected results).
     Example:  If number is 6, this methods returns 6 * 5 * 4 * 3 * 2 * 1 = 720.0
     Example:  If number is 10, this methods returns 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 362880.0
     Example:  If number is 20, this methods returns 2.43290200817664E18 ≈ 2.43 x 1018
     */
    public double factorial(int number)
    {
        double x = number;
        double facTotal = x;
        while (x != 1) {
            x = x-1;
            facTotal = facTotal * x;

        }
        return facTotal;
    }

    public String printDigits(int number) {
        String s =String.valueOf(number);
        int x = s.length();
        int y = 0;
        String digits = "";
        while (x != y) {
            digits = s.substring(x-1,x);
            System.out.println(digits);
            x--;
        }
        return digits;
    }
//   digits = s.substring(y,y+1);
//            System.out.println(digits);
//            y++;
    }