package stack;

public class StackOverflow {

    // 3! = 3 * 2 * 1
    // 5! = 5 * 4 * 3 * 2 * 1
    public static int calcFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int nextFactorialFrom = n - 1;
        int nextFact = calcFactorial(nextFactorialFrom);
        return n * nextFact;
    }

    // 3!  =
    // return 3 * calcFactorial(2)
    // return 2 * calcFactorial(1)
    // return 1;

    public static void main(String[] args) {
        System.out.println("calcFactorial(5) = " + calcFactorial(3));
    }
}
